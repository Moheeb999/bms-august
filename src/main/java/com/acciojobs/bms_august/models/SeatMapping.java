package com.acciojobs.bms_august.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="seatmapping")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatMapping extends GlobalRecord{
    private  String rowNumber;
    private Hall hall;
    private String seatRange;
    private String seatBreak;
    private  String seatNumber;
}
