package com.example.phoneshop_night.service;

import com.example.phoneshop_night.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);
    Brand getById(Integer id);
    Brand update(Integer id, Brand brandUpdate);
}
