package com.flight.flightapp.entity;

public class FlightSchedule {

    private int flightScheduleId;
    private String origin;
    private String destination;
    private String departureUtc;
    private String arrivalUtc;
    private int originUtcOffset;
    private int destinationUtcOffset;
    private String originTimezone;
    private String destinationTimezone;
    private String aircraftType;
    private int aircraftTypeId;
    private String aircraftCategory;
    private int aircraftCategoryId;
    private String operator;
    private String source;
    private int routeGroupId;
    private String routeGroupName;
    private String routeGroupColor;
    private int directionId;
    private String directionName;
    private int eft;
    private String tailNumber;
    private int seatsLeft;
    private int rebateSeats;
    private int passengerCount;
    private String originFbo;
    private String destinationFbo;



    public int getFlightScheduleId() {
        return flightScheduleId;
    }

    public void setFlightScheduleId(int flightScheduleId) { this.flightScheduleId = flightScheduleId; }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) { this.destination = destination; }

    public String getDepartureUtc() {
        return departureUtc;
    }

    public void setDepartureUtc(String departureUtc) {
        this.departureUtc = departureUtc;
    }

    public String getArrivalUtc() {
        return arrivalUtc;
    }

    public void setArrivalUtc(String arrivalUtc) {
        this.arrivalUtc = arrivalUtc;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getAircraftTypeId() {
        return aircraftTypeId;
    }

    public void setAircraftTypeId(int aircraftTypeId) {
        this.aircraftTypeId = aircraftTypeId;
    }

    public String getAircraftCategory() {
        return aircraftCategory;
    }

    public void setAircraftCategory(String aircraftCategory) {
        this.aircraftCategory = aircraftCategory;
    }

    public int getAircraftCategoryId() {
        return aircraftCategoryId;
    }

    public void setAircraftCategoryId(int aircraftCategoryId) {
        this.aircraftCategoryId = aircraftCategoryId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getOriginUtcOffset() { return originUtcOffset; }

    public void setOriginUtcOffset(int originUtcOffset) { this.originUtcOffset = originUtcOffset; }

    public int getDestinationUtcOffset() { return destinationUtcOffset; }

    public void setDestinationUtcOffset(int destinationUtcOffset) { this.destinationUtcOffset = destinationUtcOffset; }

    public String getOriginTimezone() { return originTimezone; }

    public void setOriginTimezone(String originTimezone) { this.originTimezone = originTimezone; }

    public String getDestinationTimezone() { return destinationTimezone; }

    public void setDestinationTimezone(String destinationTimezone) { this.destinationTimezone = destinationTimezone; }

    public int getRouteGroupId() { return routeGroupId; }

    public void setRouteGroupId(int routeGroupId) { this.routeGroupId = routeGroupId; }

    public String getRouteGroupName() { return routeGroupName; }

    public void setRouteGroupName(String routeGroupName) { this.routeGroupName = routeGroupName; }

    public String getRouteGroupColor() { return routeGroupColor; }

    public void setRouteGroupColor(String routeGroupColor) { this.routeGroupColor = routeGroupColor; }

    public int getDirectionId() { return directionId; }

    public void setDirectionId(int directionId) { this.directionId = directionId; }

    public String getDirectionName() { return directionName; }

    public void setDirectionName(String directionName) { this.directionName = directionName; }

    public int getEft() { return eft; }

    public void setEft(int eft) { this.eft = eft; }

    public String getTailNumber() { return tailNumber; }

    public void setTailNumber(String tailNumber) { this.tailNumber = tailNumber; }

    public int getSeatsLeft() { return seatsLeft; }

    public void setSeatsLeft(int seatsLeft) { this.seatsLeft = seatsLeft; }

    public int getRebateSeats() { return rebateSeats; }

    public void setRebateSeats(int rebateSeats) { this.rebateSeats = rebateSeats; }

    public int getPassengerCount() { return passengerCount; }

    public void setPassengerCount(int passengerCount) { this.passengerCount = passengerCount; }

    public String getOriginFbo() { return originFbo; }

    public void setOriginFbo(String originFbo) { this.originFbo = originFbo; }

    public String getDestinationFbo() { return destinationFbo; }

    public void setDestinationFbo(String destinationFbo) { this.destinationFbo = destinationFbo; }
}
