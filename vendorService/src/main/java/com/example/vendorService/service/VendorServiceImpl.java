package com.example.vendorService.service;

import com.example.vendorService.model.Vendor;
import com.example.vendorService.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService{
    private  final VendorRepository vendorRepository;

    @Override
    public List<Vendor> getVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendor addVendors(Vendor vendor) {
        return vendorRepository.save(vendor);
    }


}
