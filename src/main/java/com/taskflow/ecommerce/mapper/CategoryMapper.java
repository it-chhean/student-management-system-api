package com.taskflow.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.taskflow.ecommerce.dto.request.CategoryRequest;
import com.taskflow.ecommerce.dto.response.CategoryResponse;
import com.taskflow.ecommerce.entities.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toCategory(CategoryRequest categoryRequest);

    CategoryResponse toCategoryResponse(Category category);

    void updateEntity(CategoryRequest request, @MappingTarget Category category);

}
