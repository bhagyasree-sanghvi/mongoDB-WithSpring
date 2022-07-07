package com.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.entity.Reservation;
import com.mongodb.repository.ReservationRepo;

public class ReservationService {
	@Autowired
	ReservationRepo reservationRepo;

	public List<Reservation> getAllReservations() {
		return reservationRepo.findAll();
	}

	public Reservation getReservationById(String reservationId) {
		return reservationRepo.findById(reservationId).get();
	}

	public Reservation addReservation(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	public Reservation updateReservationStatus(String reservationId, String status) {
		Reservation reservation = reservationRepo.findById(reservationId).get();
		reservation.setStatus(status);
		return reservationRepo.save(reservation);
	}

}
