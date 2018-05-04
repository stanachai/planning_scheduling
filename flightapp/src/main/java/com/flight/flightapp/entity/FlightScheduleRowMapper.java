package com.flight.flightapp.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class FlightScheduleRowMapper implements RowMapper<FlightSchedule> {

    @Override

    public FlightSchedule mapRow(ResultSet row, int rowNum) throws SQLException {
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setFlightScheduleId(row.getInt("flight_schedule_id"));
        flightSchedule.setOrigin(row.getString("origin"));
        flightSchedule.setDestination(row.getString("destination"));
        flightSchedule.setDepartureUtc(row.getString("departure_utc"));
        flightSchedule.setArrivalUtc(row.getString("arrival_utc"));
        flightSchedule.setOriginUtcOffset(row.getInt("origin_utc_offset"));
        flightSchedule.setDestinationUtcOffset(row.getInt("destination_utc_offset"));
        flightSchedule.setOriginTimezone(row.getString("origin_timezone"));
        flightSchedule.setDestinationTimezone(row.getString("destination_timezone"));
        flightSchedule.setSource(row.getString("source"));
        flightSchedule.setOperator(row.getString("operator"));
        flightSchedule.setAircraftType(row.getString("aircraft_type"));
        flightSchedule.setAircraftTypeId(row.getInt("aircraft_type_id"));
        flightSchedule.setAircraftCategory(row.getString("aircraft_category"));
        flightSchedule.setAircraftCategoryId(row.getInt("aircraft_category_id"));
        flightSchedule.setRouteGroupId(row.getInt("route_group_id"));
        flightSchedule.setRouteGroupName(row.getString("route_group_name"));
        flightSchedule.setRouteGroupColor(row.getString("route_group_color"));
        flightSchedule.setDirectionId(row.getInt("direction_id"));
        flightSchedule.setDirectionName(row.getString("direction_name"));
        flightSchedule.setTailNumber(row.getString("tail_number"));
        flightSchedule.setSeatsLeft(row.getInt("seats_left"));
        flightSchedule.setRebateSeats(row.getInt("rebate_seats"));
        flightSchedule.setPassengerCount(row.getInt("passenger_count"));
        flightSchedule.setOriginFbo(row.getString("origin_fbo"));
        flightSchedule.setDestinationFbo(row.getString("destination_fbo"));
        flightSchedule.setEft(row.getInt("eft"));
        return flightSchedule;
    }
}
