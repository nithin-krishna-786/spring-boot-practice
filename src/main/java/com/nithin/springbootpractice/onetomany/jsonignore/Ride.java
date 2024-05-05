package com.nithin.springbootpractice.onetomany.jsonignore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "rides")
@Data
public class Ride {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String ride;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id", referencedColumnName = "id")
	private Driver driver;
}
