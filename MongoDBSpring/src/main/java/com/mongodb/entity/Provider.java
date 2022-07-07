package com.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Document("Provider")
public class Provider {
	@Id
	private String memberId;
	private String name;
	
}
