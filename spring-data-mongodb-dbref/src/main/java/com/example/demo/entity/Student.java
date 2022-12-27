package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "student")
public class Student {

	@Id
	private String id;
	private String name;

	@Field(name = "mail")
	private String email;

	@DBRef
	private Department department;

	@DBRef
	private List<Subject> subjects;

	@Transient
	private double percentage;

	public double getPercentage() {
		if (subjects != null && subjects.size() > 0) {
			int total = 0;
			for (Subject subject : subjects) {
				total += subject.getMarksObtained();
			}
			return total / subjects.size();
		}
		return 0.00;
	}
}
