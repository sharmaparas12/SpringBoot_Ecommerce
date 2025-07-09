
package com.example.Ecommerce.gateway.api;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "categoryClient", url = "https://fakestoreapi.in/api/")
public interface FakeStoreCategoryOpenFeign {

    @GetMapping("/products/categories")
    FakeStoreCategoryResponseDTO getAllCategories();
}
