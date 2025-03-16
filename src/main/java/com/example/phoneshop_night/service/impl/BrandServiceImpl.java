package com.example.phoneshop_night.service.impl;

import com.example.phoneshop_night.entity.Brand;
import com.example.phoneshop_night.repository.BrandRepository;
import com.example.phoneshop_night.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}
