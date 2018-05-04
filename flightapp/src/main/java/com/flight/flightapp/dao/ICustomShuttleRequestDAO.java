package com.flight.flightapp.dao;

import java.util.List;
import com.flight.flightapp.entity.CustomShuttleRequest;
import org.springframework.dao.DataAccessException;

public interface ICustomShuttleRequestDAO {
    List<CustomShuttleRequest> getCustomShuttleRequestByParameters(String orig, String dest, String startDate, String endDate, int aircraft_category_id) throws DataAccessException;
    CustomShuttleRequest getCustomShuttleRequestById(int customShuttleRequestId) throws DataAccessException ;
    //void addCustomShuttleRequest(CustomShuttleRequest customShuttleRequest);
    //void updateCustomShuttleRequest(CustomShuttleRequest customShuttleRequest);
    //void deleteCustomShuttleRequest(int customShuttleRequestId);
    //boolean customShuttleRequestExists(String origin, String destination, int aircraft_category_id, String startDate, String endDate);

}