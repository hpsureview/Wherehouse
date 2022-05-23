package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Supplier;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier" , collectionResourceRel = "List", excerptProjection = Custom_Supplier.class)

public interface Supplier_Repos extends JpaRepository<Supplier,Integer> {
}
