package com.nithin.springbootpractice.onetoone.bidirectional.mapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
