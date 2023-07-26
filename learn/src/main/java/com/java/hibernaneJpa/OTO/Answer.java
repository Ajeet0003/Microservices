package com.java.hibernaneJpa.OTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Answer {

	@Id
	int answerId;
	String answer;
}
