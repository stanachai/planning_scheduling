package com.flight.flightapp.service;
import java.util.List;
import com.flight.flightapp.entity.CustomShuttleRequest;
public interface ICustomShuttleRequestService {
    List<CustomShuttleRequest> getCustomShuttleRequestByParameters(String origin, String destination, String startDate, String endDate, int aircraftCategoryId);
    CustomShuttleRequest getCustomShuttleRequestById(int customShuttleRequestId);
    //boolean addCustomShuttleRequest(CustomShuttleRequest customShuttleRequest);
    //void updateCustomShuttleRequest(CustomShuttleRequest customShuttleRequest);
    //void deleteCustomShuttleRequest(int customShuttleRequestId);
}