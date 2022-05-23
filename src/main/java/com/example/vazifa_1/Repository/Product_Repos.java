package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Product;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product" , collectionResourceRel = "List", excerptProjection = Custom_Product.class)

public interface Product_Repos extends JpaRepository<Product,Integer> {
}
