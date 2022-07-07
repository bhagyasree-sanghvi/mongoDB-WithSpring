package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.entity.Reservation;

public interface ReservationRepo extends MongoRepository<Reservation, String>{
	

}
