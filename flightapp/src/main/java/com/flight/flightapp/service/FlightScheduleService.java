package com.flight.flightapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flight.flightapp.dao.IFlightScheduleDAO;
import com.flight.flightapp.entity.FlightSchedule;
@Service
public class FlightScheduleService implements IFlightScheduleService {
    @Autowired
    private IFlightScheduleDAO flightScheduleDAO;
    @Override
    public FlightSchedule getFlightScheduleById(int flightScheduleId) {
        FlightSchedule obj = flightScheduleDAO.getFlightScheduleById(flightScheduleId);
        return obj;
    }
    @Override
    public List<FlightSchedule> getFlightScheduleByParameters(String origin, String destination, String startDate, String endDate, int aircraftCategoryId, int routeGroupId, int directionId) {
        return flightScheduleDAO.getFlightScheduleByParameters(origin, destination, startDate, endDate, aircraftCategoryId, routeGroupId, directionId);
    }

}