package com.nithin.springbootpractice.lms.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "enrollments")
@Data
public class Enrollment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="enrollment_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "user_id")
	private User enrolledStudent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id",referencedColumnName = "subject_id")
	private Subject subject;
	
}
