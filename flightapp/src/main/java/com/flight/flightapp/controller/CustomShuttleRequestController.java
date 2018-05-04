package com.flight.flightapp.controller;

import java.util.List;

import com.flight.flightapp.entity.CustomShuttleRequest;
import com.flight.flightapp.service.ICustomShuttleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import com.flight.flightapp.entity.FlightSchedule;
import com.flight.flightapp.service.IFlightScheduleService;
@RestController
public class CustomShuttleRequestController {
    @Autowired
    private ICustomShuttleRequestService customShuttleRequestService;

    @RequestMapping(value = "customshuttlerequest/{id}", method = RequestMethod.GET)
    public ResponseEntity<CustomShuttleRequest> getCustomShuttleRequestById(@PathVariable("id") Integer id) {
        CustomShuttleRequest customShuttleRequest = customShuttleRequestService.getCustomShuttleRequestById(id);
        return new ResponseEntity<CustomShuttleRequest>(customShuttleRequest, HttpStatus.OK);
    }
    @RequestMapping(value = "customshuttlerequestlistparam", method = RequestMethod.GET)
    public ResponseEntity<List<CustomShuttleRequest>> getCustomerShuttleRequestsByParamaters(@RequestParam(required = false, defaultValue = " ") String origin, @RequestParam(required = false, defaultValue = " ") String destination, @RequestParam(required = true) String startDate,
                                                                                             @RequestParam(required = true) String endDate, @RequestParam(required = false, defaultValue = "0") int aircraftCategoryId) {
        List<CustomShuttleRequest> list = customShuttleRequestService.getCustomShuttleRequestByParameters(origin, destination, startDate, endDate, aircraftCategoryId);
        return new ResponseEntity<List<CustomShuttleRequest>>(list, HttpStatus.OK);
    }
}
