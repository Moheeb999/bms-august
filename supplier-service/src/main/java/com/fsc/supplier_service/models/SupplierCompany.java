package com.fsc.supplier_service.models;


import com.fsc.supplier_service.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="Supplier-Company")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SupplierCompany extends Company {

    private String supplierId;
    private String supplierCode;
    @Enumerated
    private SupplierType supplierType;

    // Business Capability
    private String primaryProducts;//Change to list of products
    private String supportedRegions;
    private Integer productionCapacityPerMonth;
    private Integer leadTimeInDays;
    private Integer yearsInBusiness;

    // Financial Information
    private BigDecimal minimumOrderValue;
    private BigDecimal annualRevenue;
    @Enumerated
    private Currency preferredCurrency;
    @Enumerated
    private PaymentTerms paymentTerms;

    // Banking & Payment
    private Boolean bankAccountVerified;
    private String bankName;
    private String bankAccountNumber;
    private String swiftCode;
    private String iban;

    // Procurement Configuration
    private Boolean acceptsPurchaseOrders;
    private Boolean invoiceSubmissionEnabled;
    private Boolean ediEnabled;
    private Boolean catalogEnabled;

    // Compliance & Verification
    private Boolean taxVerified;
    private Boolean insuranceVerified;
    private Boolean isoCertified;
    private Boolean ndaSigned;
    @Enumerated
    private ComplianceStatus complianceStatus;


    // Supplier Performance
    private Double supplierRating;
    private Double qualityScore;
    private Double deliveryScore;
    private Double responseScore;
    private Integer completedOrders;

    // Risk & Approval
    @Enumerated
    private RiskLevel riskLevel;
    @Enumerated
    private SupplierStatus supplierStatus;
    private Boolean blacklisted;

    // Contract Information
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private Boolean contractActive;

    // Diversity & Sustainability
    private Boolean diversitySupplier;
    private Boolean sustainabilityCertified;
    private String certifications;

    // Internal Metadata
    private UUID accountManagerId;
    private User approvedBy;
    private LocalDateTime approvedAt;
    private LocalDateTime lastAuditDate;

    //Notes
    private String internalRemarks;
}
