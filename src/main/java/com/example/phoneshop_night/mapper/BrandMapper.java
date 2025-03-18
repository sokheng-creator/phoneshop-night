package com.example.phoneshop_night.mapper;

import com.example.phoneshop_night.dto.BrandDTO;
import com.example.phoneshop_night.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
//    @Mapping(source="vs", target="version")
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO dto);

    BrandDTO toBrandDTO(Brand entity);
}
