package com.nithin.springbootpractice.inheritance;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

}
