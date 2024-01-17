package com.example.vendorService.repository;

import com.example.vendorService.model.Vendor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface VendorRepository extends JpaRepository<Vendor,Integer> {


}
