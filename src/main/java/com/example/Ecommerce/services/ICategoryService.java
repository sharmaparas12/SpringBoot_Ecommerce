package com.example.Ecommerce.services;

import com.example.Ecommerce.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> getAllCategories() throws IOException;

}
