package com.nithin.springbootpractice.onetoone.unidirectional.mapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
