package com.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Document("Reservation")
public class Reservation {
	@Id
	private String reservationId;
	@DocumentReference
	private Patient reservationFor;
	@DocumentReference
	private Provider provider;
	private String reservationTime;
	private String encounterId;
	private String status;
	private String tokenNumber;
	private String label;
}
