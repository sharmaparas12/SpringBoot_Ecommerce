package com.example.Ecommerce.services;

import com.example.Ecommerce.dto.CategoryDTO;
import com.example.Ecommerce.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    // @Qualifier("FakeStoreCategoryGateway")
    public FakeStoreCategoryService(
            ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    // List<CategoryDTO>
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
