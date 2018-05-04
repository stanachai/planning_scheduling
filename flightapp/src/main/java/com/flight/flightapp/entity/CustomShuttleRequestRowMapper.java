package com.flight.flightapp.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomShuttleRequestRowMapper implements RowMapper<CustomShuttleRequest> {

    @Override

    public CustomShuttleRequest mapRow(ResultSet row, int rowNum) throws SQLException {
        CustomShuttleRequest customShuttleRequest = new CustomShuttleRequest();
        customShuttleRequest.setRequestId(row.getInt("request_id"));
        customShuttleRequest.setDirectLegId(row.getInt("direct_leg_id"));
        customShuttleRequest.setReturnLegId(row.getInt("return_leg_id"));
        customShuttleRequest.setOrigin(row.getString("origin"));
        customShuttleRequest.setDestination(row.getString("destination"));
        customShuttleRequest.setDepartureUtc(row.getString("departure_utc"));
        customShuttleRequest.setArrivalUtc(row.getString("arrival_utc"));
        customShuttleRequest.setOriginUtcOffset(row.getInt("origin_utc_offset"));
        customShuttleRequest.setDestinationUtcOffset(row.getInt("destination_utc_offset"));
        customShuttleRequest.setOriginTimezone(row.getString("origin_timezone"));
        customShuttleRequest.setDestinationTimezone(row.getString("destination_timezone"));
        customShuttleRequest.setAircraftCategory(row.getString("aircraft_category"));
        customShuttleRequest.setAircraftCategoryId(row.getInt("aircraft_category_id"));

        return customShuttleRequest;
    }
}
