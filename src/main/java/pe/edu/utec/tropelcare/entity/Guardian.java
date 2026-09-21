package pe.edu.utec.tropelcare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import java.time.Instant;

@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 60)
    @Column(nullable = false, length = 60)
    private String displayName;
    @Email
    @Column(nullable = false, unique = true)
    private String email;
    @Email
    @Column(nullable = false)
    private String notificationEmail;
    private Instant createdAt;
}


