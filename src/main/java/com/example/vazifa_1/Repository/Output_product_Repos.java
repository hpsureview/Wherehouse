package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_output_product;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Output_product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output_product" , collectionResourceRel = "List", excerptProjection = Custom_output_product.class)

public interface Output_product_Repos extends JpaRepository<Output_product,Integer> {
}
