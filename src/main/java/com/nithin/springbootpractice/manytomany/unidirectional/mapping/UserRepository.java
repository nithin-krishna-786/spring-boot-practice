package com.nithin.springbootpractice.manytomany.unidirectional.mapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
