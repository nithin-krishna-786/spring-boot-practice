package com.nithin.springbootpractice.validation3;

import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UniquePhoneNumberValidator.class)
public @interface UniquePhoneNumber {

    public String message() default "Phonenumber already exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
