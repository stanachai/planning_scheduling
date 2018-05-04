package com.flight.flightapp.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.flight.flightapp.entity.FlightSchedule;
import com.flight.flightapp.entity.FlightScheduleRowMapper;

@Transactional
@Repository
public class FlightScheduleDAO implements IFlightScheduleDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public FlightSchedule getFlightScheduleById(int flightScheduleId) throws DataAccessException {
        String sql = "SELECT * FROM public.flight_schedule_vw where flight_schedule_id = ?";
        RowMapper<FlightSchedule> rowMapper = new BeanPropertyRowMapper<FlightSchedule>(FlightSchedule.class);
        try {
            FlightSchedule flightSchedule = jdbcTemplate.queryForObject(sql, rowMapper, flightScheduleId);
            return flightSchedule;
        }
        catch (EmptyResultDataAccessException e)
        {
            return null;
        }
        catch (InvalidResultSetAccessException e)
        {
            throw new RuntimeException(e);
        }
        catch (DataAccessException e)
        {
            throw new RuntimeException(e);
        }

    }
    @Override
    public List<FlightSchedule> getFlightScheduleByParameters(String origin, String destination, String startDate, String endDate, int aircraftCategoryId, int routeGroupId, int directionId)  throws DataAccessException{

        //Conditional strings to construct the query
        String originStr = " ? IS NOT NULL ";
        String destinationStr = " ? IS NOT NULL ";
        String aircraftCategoryIdStr = " ? IS NOT NULL ";
        String routeGroupIdStr = " ? IS NOT NULL ";
        String directionIdStr = " ? IS NOT NULL ";
        String dateStr = " departure_utc BETWEEN (?)::timestamptz AND (?)::timestamptz ";

        //If value for origin is provided
        if (!(origin == null || origin.equals(" ")))
            originStr = " origin = ? ";
        //If value for destination is provided
        if (!(destination == null || destination.equals(" ")))
            destinationStr = " destination = ? ";
        //If value for aircraft type id is provided
        if(aircraftCategoryId != 0 )
            aircraftCategoryIdStr = " aircraft_category_id = ? ";
        //If value for route group id is provided
        if(routeGroupId != 0)
            routeGroupIdStr = " route_group_id = ? ";
        //If value for direction id is provided
        if(directionId != 0)
            directionIdStr = " direction_id = ? ";



        String sql = "SELECT * FROM public.flight_schedule_vw WHERE "+originStr+"AND"+destinationStr+"AND"+dateStr+"AND"+aircraftCategoryIdStr+
                "AND"+routeGroupIdStr+"AND"+directionIdStr;


        RowMapper<FlightSchedule> rowMapper = new FlightScheduleRowMapper();
        try {
            return this.jdbcTemplate.query(sql, rowMapper, origin, destination, startDate, endDate, aircraftCategoryId, routeGroupId, directionId);
        }
        catch (EmptyResultDataAccessException e)
        {
            return null;
        }
        catch (InvalidResultSetAccessException e)
        {
            throw new RuntimeException(e);
        }
        catch (DataAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

}
