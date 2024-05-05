package com.nithin.springbootpractice.fetchtype.eager;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "todos")
@Data
public class Todo {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	private String message;
	
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private User user;
	
	public Todo()
	{
		
	}
	
	public Todo(String message) {
		super();
		this.message = message;
	}
}
