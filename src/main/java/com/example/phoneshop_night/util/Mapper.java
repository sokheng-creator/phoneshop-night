package com.example.phoneshop_night.util;

import com.example.phoneshop_night.dto.BrandDTO;
import com.example.phoneshop_night.entity.Brand;

public class Mapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setId(dto.getId());
        brand.setName((dto.getName()));
        return brand;
    }
}
