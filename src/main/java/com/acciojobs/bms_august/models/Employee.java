package com.acciojobs.bms_august.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee")
public class Employee extends User{


    @ManyToOne
    private Company company;

    @Column(nullable = false, unique = true)
    private String employeeCode;

    private String designation;

    private String department;

    private String workLocation;

    @ManyToOne
    private Employee manager;

    @Column(nullable = false)
    private boolean active = true;
}
