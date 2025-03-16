package com.example.phoneshop_night.repository;


import com.example.phoneshop_night.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
