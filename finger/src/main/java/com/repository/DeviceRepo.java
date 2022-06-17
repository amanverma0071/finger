package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Device;

@Repository
public interface DeviceRepo extends JpaRepository<Device, Integer> {

}
