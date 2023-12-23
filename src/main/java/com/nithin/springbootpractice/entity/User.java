package com.nithin.springbootpractice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String email;
}
