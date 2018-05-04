package com.flight.flightapp.entity;

public class CustomShuttleRequest {

    private int requestId;
    private int directLegId;
    private int returnLegId;
    private String origin;
    private String destination;
    private String departureUtc;
    private String arrivalUtc;
    private String originTimezone;
    private String destinationTimezone;
    private int originUtcOffset;
    private int destinationUtcOffset;
    private String aircraftCategory;
    private int aircraftCategoryId;


    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getDirectLegId() {
        return directLegId;
    }

    public void setDirectLegId(int directLegId) {
        this.directLegId = directLegId;
    }

    public int getReturnLegId() {
        return returnLegId;
    }

    public void setReturnLegId(int returnLegId) {
        this.returnLegId = returnLegId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

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

    public int getOriginUtcOffset() { return originUtcOffset; }

    public void setOriginUtcOffset(int originUtcOffset) { this.originUtcOffset = originUtcOffset; }

    public int getDestinationUtcOffset() { return destinationUtcOffset; }

    public void setDestinationUtcOffset(int destinationUtcOffset) { this.destinationUtcOffset = destinationUtcOffset; }

    public String getOriginTimezone() { return originTimezone; }

    public void setOriginTimezone(String originTimezone) { this.originTimezone = originTimezone; }

    public String getDestinationTimezone() { return destinationTimezone; }

    public void setDestinationTimezone(String destinationTimezone) { this.destinationTimezone = destinationTimezone; }

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


}
