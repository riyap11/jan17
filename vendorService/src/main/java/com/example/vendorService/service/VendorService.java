package com.example.vendorService.service;


import com.example.vendorService.model.Vendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorService {

    List<Vendor> getVendors();
   Vendor addVendors(Vendor vendor);
}
