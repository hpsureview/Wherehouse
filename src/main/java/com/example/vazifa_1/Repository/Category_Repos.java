package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Catagory;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cateory" , collectionResourceRel = "List", excerptProjection = Custom_Catagory.class)

public interface Category_Repos extends JpaRepository<Category,Integer> {
}
