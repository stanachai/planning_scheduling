package com.flight.flightapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flight.flightapp.dao.ICustomShuttleRequestDAO;
import com.flight.flightapp.entity.CustomShuttleRequest;
@Service
public class CustomShuttleRequestService implements ICustomShuttleRequestService {
    @Autowired
    private ICustomShuttleRequestDAO customShuttleRequestDAO;
    @Override
    public CustomShuttleRequest getCustomShuttleRequestById(int customShuttleRequestId) {
        CustomShuttleRequest obj = customShuttleRequestDAO.getCustomShuttleRequestById(customShuttleRequestId);
        return obj;
    }
    @Override
    public List<CustomShuttleRequest> getCustomShuttleRequestByParameters(String origin, String destination, String startDate, String endDate, int aircraftCategoryId) {
        return customShuttleRequestDAO.getCustomShuttleRequestByParameters(origin, destination, startDate, endDate, aircraftCategoryId);
    }
}
