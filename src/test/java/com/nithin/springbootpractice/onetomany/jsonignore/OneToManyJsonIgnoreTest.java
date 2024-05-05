package com.nithin.springbootpractice.onetomany.jsonignore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class OneToManyJsonIgnoreTest {

	@Autowired
	private RideRepository rideRepository;
	
    @Autowired
	private DriverRepository driverRepository;

	@Test
	void method1() {
		
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
