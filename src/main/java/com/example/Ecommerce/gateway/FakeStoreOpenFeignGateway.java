package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.CategoryDTO;
import com.example.Ecommerce.dto.FakeStoreCategoryResponseDTO;
import com.example.Ecommerce.gateway.api.FakeStoreCategoryOpenFeign;
import com.example.Ecommerce.mappers.GetAllCategoriesMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Primary;

import java.io.IOException;
import java.util.List;

@Primary
public class FakeStoreOpenFeignGateway implements ICategoryGateway {

    private final FakeStoreCategoryOpenFeign fakeStoreCategoryOpenFeign;

    public FakeStoreOpenFeignGateway(FakeStoreCategoryOpenFeign fakeStoreCategoryOpenFeign) {
        this.fakeStoreCategoryOpenFeign = fakeStoreCategoryOpenFeign;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // 1. Make the HTTP request to the FakeStore API to fetch all categories
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryOpenFeign.getAllCategories();

        // 2. Check if the response is null and throw an IOException if it is
        if (response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        // 3. Map the response to a list of CategoryDTO objects
        return GetAllCategoriesMapper.toCategoryDto(response);
    }

}
