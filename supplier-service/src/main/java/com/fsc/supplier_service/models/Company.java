package com.fsc.supplier_service.models;

import com.fsc.supplier_service.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Companies")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company extends GlobalRecord{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID sysId;// not an human readable id
    private String companyId;// comp-001

    private String legalName;
    private String displayName;
    @Enumerated
    private CompanyType companyType;
    private String tax_id;
    private String companyRegistrationNumber;
    private Industry industry;
    private String website;
    private String email;
    private String phone;
    private int foundedYear;
    private int employeeCount;
    private double annualRevenue;
    @Enumerated
    private String logUrl;
    @Enumerated
    private TimeZone timeZone;
    @Enumerated
    private Currency currency;
    @Enumerated
    private Language language;
    @Enumerated
    private CompanyStatus companyStatus;

}
