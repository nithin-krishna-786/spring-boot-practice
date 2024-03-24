package com.nithin.springbootpractice.lms.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class LMSApplicationTest {

    @Autowired
    private EnrollmentRepository enrollmentRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    void method1(){
    	User cseStudent = userRepository.findByName("cse-student");
    	Subject cse1 = subjectRepository.findByName("cse1");
    	Enrollment enrollment =  new Enrollment();
    	enrollment.setEnrolledStudent(cseStudent);
    	enrollment.setSubject(cse1);
    	enrollmentRepository.save(enrollment);
    }

}
