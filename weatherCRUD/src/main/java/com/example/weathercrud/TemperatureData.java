package com.example.weathercrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "temperature_data")
public class TemperatureData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "timestamp")
    private Timestamp timestamp;

}





