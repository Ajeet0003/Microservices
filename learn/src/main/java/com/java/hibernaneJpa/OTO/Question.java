package com.java.hibernaneJpa.OTO;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Question {

	@Id
	int questionId;
	String question;

	@OneToMany(mappedBy = "answer", orphanRemoval = true, cascade = { CascadeType.ALL })
	List<Answer> answer = new ArrayList<>();

}
