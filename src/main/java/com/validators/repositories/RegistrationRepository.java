package com.validators.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validators.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
