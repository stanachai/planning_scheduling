package com.flight.flightapp.service;
import java.util.List;
import com.flight.flightapp.entity.FlightSchedule;
public interface IFlightScheduleService {
    List<FlightSchedule> getFlightScheduleByParameters(String origin, String destination, String startDate, String endDate, int aircraft_category_id, int routeGroupId, int directionId);
    FlightSchedule getFlightScheduleById(int flightScheduleId);
    //boolean addFlightSchedule(FlightSchedule flightSchedule);
    //void updateFlightSchedule(FlightSchedule flightSchedule);
    //void deleteFlightSchedule(int flightScheduleId);
}