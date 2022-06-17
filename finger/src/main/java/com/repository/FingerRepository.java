package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Finger;

@Repository
public interface FingerRepository extends JpaRepository<Finger,Integer> {

	
	
	
}
