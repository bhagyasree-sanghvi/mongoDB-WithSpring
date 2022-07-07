package com.mongodb.entity;

import java.util.Set;

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
@Document("Patient")
public class Patient {
	@Id
	private String patientId;
	
	@DocumentReference(lazy = true)
	private Provider member;
	private String healthId;
	private String uhId;
	private String name;
	private String gender;
	private String dob;
	private String phone;

}
