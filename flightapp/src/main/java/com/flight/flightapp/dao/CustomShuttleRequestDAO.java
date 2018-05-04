package com.flight.flightapp.dao;

import java.util.List;

import com.flight.flightapp.entity.FlightSchedule;
import com.flight.flightapp.entity.FlightScheduleRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.flight.flightapp.entity.CustomShuttleRequest;
import com.flight.flightapp.entity.CustomShuttleRequestRowMapper;

@Transactional
@Repository
public class CustomShuttleRequestDAO implements ICustomShuttleRequestDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public CustomShuttleRequest getCustomShuttleRequestById(int requestId)  throws DataAccessException {
        String sql = "SELECT request_id, COALESCE (direct_leg_id::int,-1) as direct_leg_id, COALESCE(return_leg_id::int,-1)" +
                ", origin, destination, departure_utc, arrival_utc, origin_utc_offset, destination_utc_offset, origin_timezone, " +
                "destination_timezone, aircraft_category, aircraft_category_id FROM public.flight_custom_shuttle_request_vw where request_id = ?";
        RowMapper<CustomShuttleRequest> rowMapper = new BeanPropertyRowMapper<CustomShuttleRequest>(CustomShuttleRequest.class);
        try {
            CustomShuttleRequest customShuttleRequest = jdbcTemplate.queryForObject(sql, rowMapper, requestId);
            return customShuttleRequest;
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
    public List<CustomShuttleRequest> getCustomShuttleRequestByParameters(String origin, String destination, String startDate, String endDate, int aircraftCategoryId) {

        String originStr = " ? IS NOT NULL ";
        String destinationStr = " ? IS NOT NULL ";
        String aircraftCategoryIdStr = " ? IS NOT NULL ";
        String dateStr = " departure_utc BETWEEN (?)::timestamptz AND (?)::timestamptz ";


        if(!origin.equals(" "))
            originStr = " origin = ? ";

        if(!destination.equals(" "))
            destinationStr = " destination = ? ";

        if(aircraftCategoryId != 0)
            aircraftCategoryIdStr = " aircraft_category_id = ? ";

        String sql = "SELECT request_id, COALESCE (direct_leg_id::int,-1) as direct_leg_id, COALESCE(return_leg_id::int,-1) as return_leg_id" +
                ", origin, destination, departure_utc, arrival_utc, origin_utc_offset, destination_utc_offset, origin_timezone, destination_timezone, " +
                "aircraft_category, aircraft_category_id FROM public.flight_custom_shuttle_request_vw WHERE "+originStr+"AND"+destinationStr+"AND"+dateStr+"AND"+aircraftCategoryIdStr;

        try {
            RowMapper<CustomShuttleRequest> rowMapper = new CustomShuttleRequestRowMapper();
            return this.jdbcTemplate.query(sql, rowMapper, origin, destination, startDate, endDate, aircraftCategoryId);
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