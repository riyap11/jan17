package com.example.vendorService.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Vendor {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vendor_name")
    private  String vendor_name;


    @Column(name = "vendor_address")
    private  String vendor_address;


    //constructors , getters and setters


}
