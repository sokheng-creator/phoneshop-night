package com.example.phoneshop_night.mapper;

import com.example.phoneshop_night.dto.BrandDTO;
import com.example.phoneshop_night.entity.Brand;
import org.mapstruct.Mapper;

@Mapper
public interface BrandMapper {
    Brand toBrand(BrandDTO dto);
}
