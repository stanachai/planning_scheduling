package com.flight.flightapp.controller;

import java.util.List;
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
public class FlightScheduleController {
    @Autowired
    private IFlightScheduleService flightScheduleService;

    @RequestMapping(value = "flightschedule/{id}", method = RequestMethod.GET)
    public ResponseEntity<FlightSchedule> getFlightScheduleById(@PathVariable("id") Integer id) {
        FlightSchedule flightSchedule = flightScheduleService.getFlightScheduleById(id);
        return new ResponseEntity<FlightSchedule>(flightSchedule, HttpStatus.OK);
    }
    @RequestMapping(value = "flightschedulelistparam", method = RequestMethod.GET)
    public ResponseEntity<List<FlightSchedule>> getFlightSchedulesByParamaters(@RequestParam(required = false, defaultValue = " ") String origin, @RequestParam(required = false, defaultValue = " ") String destination, @RequestParam(required = true) String startDate,
                                                                               @RequestParam(required = true) String endDate, @RequestParam(required = false, defaultValue = "0") int aircraftCategoryId, @RequestParam(required = false, defaultValue = "0") int routeGroupId,
                                                                               @RequestParam(required = false, defaultValue = "0") int directionId) {
        List<FlightSchedule> list = flightScheduleService.getFlightScheduleByParameters(origin, destination, startDate, endDate, aircraftCategoryId, routeGroupId, directionId);
        return new ResponseEntity<List<FlightSchedule>>(list, HttpStatus.OK);
    }


}
