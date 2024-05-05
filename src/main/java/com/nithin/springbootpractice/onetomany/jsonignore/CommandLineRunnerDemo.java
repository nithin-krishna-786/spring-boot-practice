package com.nithin.springbootpractice.onetomany.jsonignore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner{
	
	@Autowired
	private RideRepository rideRepository;
	
    @Autowired
	private DriverRepository driverRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Driver driver = new Driver();
		driver.setName("DAVE");

		Ride ride1 = new Ride();
		ride1.setRide("RIDE1");
		ride1.setDriver(driver);
		
		Ride ride2 = new Ride();
		ride2.setRide("RIDE2");
		ride2.setDriver(driver);
		
		driver.setRides(List.of(ride1,ride2));
		
		driverRepository.save(driver);
		
	}

}
