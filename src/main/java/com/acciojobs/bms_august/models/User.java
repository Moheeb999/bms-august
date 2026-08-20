package com.acciojobs.bms_august.models;


import com.acciojobs.bms_august.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
@Table(name="Users")
public class User extends GlobalRecord{

    @Column(nullable=false)
    private String fullName;

    @Column(nullable=false,unique=true)
    private String email;

    @Column(nullable=false,unique=true)
    private String mobileNumber;

    @Column(nullable=false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private UserType userType;

    @Column(nullable=false)
    private boolean active=true;

    @Column(nullable=false)
    private boolean emailVerified=false;

    @Column(nullable=false)
    private boolean mobileVerified=false;

    private LocalDateTime lastLoginAt;
}
