package com.mongodb.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.entity.Reservation;
import com.mongodb.service.ReservationService;

@RestController
@RequestMapping("/mdb/v1")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
   
	@GetMapping(value = "/getreservations", produces = { "application/json" })
    public ResponseEntity<List<Reservation>> getAllReservations() {
		List<Reservation> reservations = reservationService.getAllReservations();
		return new ResponseEntity<List<Reservation>>(reservations, HttpStatus.OK);
    	
    }
	
	@GetMapping(value = "/getreservations/{id}", produces = { "application/json" })
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") String reservationId) {
		Reservation reservation = reservationService.getReservationById(reservationId);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
    	
    }
	
	@PostMapping(value="/addreservation")
	public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) throws ParseException {
		return new ResponseEntity<Reservation>(reservationService.addReservation(reservation),
				HttpStatus.CREATED);	
	}
	
	@PutMapping(value="/updatereservation/{reservationId}")
	public ResponseEntity<Reservation> updateReservation(@PathVariable("reservationId") String reservationId,
			@RequestBody String status) throws ParseException {
		return new ResponseEntity<Reservation>(reservationService.updateReservationStatus(reservationId, status),
				HttpStatus.CREATED);	
	}

}
