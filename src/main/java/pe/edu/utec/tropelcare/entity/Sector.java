package pe.edu.utec.tropelcare.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

import java.time.Instant;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sectorCode;

    @Column(nullable = false)
    private String climate;

    @Min(1)
    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer currentLoad = 0;

    @Column(nullable = false)
    private Integer stabilityLevel = 100;

    private Instant createdAt;
}