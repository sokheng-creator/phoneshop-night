package com.example.phoneshop_night.service.impl;

import com.example.phoneshop_night.entity.Brand;
import com.example.phoneshop_night.exception.ApiException;
import com.example.phoneshop_night.exception.ResourceNotFoundException;
import com.example.phoneshop_night.repository.BrandRepository;
import com.example.phoneshop_night.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Integer id) {
        /*
        Optional<Brand> brandOptional = brandRepository.findById(id);
        if(brandOptional.isPresent()){
            return brandOptional.get();
        }
        throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Brand With Id = %d not found".formatted(id));
        */
        return brandRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Brand", id));
    }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {
        Brand brand = getById(id);
        brand.setName(brandUpdate.getName());
        return brandRepository.save(brand);
    }
}
