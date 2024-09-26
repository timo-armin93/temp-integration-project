package com.example.weathercrud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureDataRepository extends JpaRepository<TemperatureData, Long> {
}
