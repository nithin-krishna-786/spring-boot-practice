package com.nithin.springbootpractice.onetomany.jsonignore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Integer> {

}
