package com.nithin.springbootpractice.manytomany.bidirectional.mapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
