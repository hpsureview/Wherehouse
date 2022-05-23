package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Input;
import com.example.vazifa_1.Projection.Custom_Input_product;
import com.example.vazifa_1.entity.Input;
import com.example.vazifa_1.entity.Input_product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Input_product.class)

public interface Input_product_Repos extends JpaRepository<Input_product,Integer> {
}
