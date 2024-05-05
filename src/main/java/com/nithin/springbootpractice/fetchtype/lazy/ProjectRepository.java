package com.nithin.springbootpractice.fetchtype.lazy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	@Query("SELECT p FROM Project p WHERE p.employee.id = :employeeId")
	List<Project> findProjectsByEmployeeId(@Param("employeeId")Long id);

}
