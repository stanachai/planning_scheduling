package com.flight.flightapp.dao;

import java.util.List;
import com.flight.flightapp.entity.FlightSchedule;
import org.springframework.dao.DataAccessException;

public interface IFlightScheduleDAO {
    List<FlightSchedule> getFlightScheduleByParameters(String orig, String dest, String startDate, String endDate, int aircraftCategoryId, int routeGroupId, int directionId)  throws DataAccessException;
    FlightSchedule getFlightScheduleById(int flightScheduleId) throws DataAccessException;
    //void addFlightSchedule(FlightSchedule flightSchedule);
    //void updateFlightSchedule(FlightSchedule flightSchedule);
    //void deleteFlightSchedule(int flightScheduleId);
    //boolean flightScheduleExists(String origin, String destination, int aircraft_category_id, String startDate, String endDate);

}