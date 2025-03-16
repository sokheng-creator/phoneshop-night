package com.example.phoneshop_night.controller;

import com.example.phoneshop_night.dto.BrandDTO;
import com.example.phoneshop_night.entity.Brand;
import com.example.phoneshop_night.service.BrandService;
import com.example.phoneshop_night.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(brand);
    }
}
