package com.acciojobs.bms_august.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="role")
public class Role extends GlobalRecord{

    @Column(nullable = false, unique = true)
    private String roleName;//Company name+role

    @ManyToMany
    private List<Operation> operations;
}
