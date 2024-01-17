package com.example.vendorService.controller;


import com.example.vendorService.model.Vendor;
import com.example.vendorService.repository.VendorRepository;
import com.example.vendorService.service.VendorService;
import com.example.vendorService.service.VendorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.logging.LoggersEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/vendorservice")
@RequiredArgsConstructor
public class VendorController {


    @Autowired
    private VendorRepository vendorRepository;

    private  final VendorService vendorService;// Dependency Inversion in solid


    @GetMapping(value = "/list")
    public List<Vendor>  getVendorList() {
     return vendorService.getVendors();

    }



    @PostMapping("/create")
    public Vendor addVendors(@RequestBody Vendor vendor) {
        return vendorService.addVendors(vendor);
    }




}
