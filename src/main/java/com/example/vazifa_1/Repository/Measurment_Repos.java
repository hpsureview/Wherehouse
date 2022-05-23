package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Measurment;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Measurment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurment" , collectionResourceRel = "List", excerptProjection = Custom_Measurment.class)

public interface Measurment_Repos extends JpaRepository<Measurment,Integer> {
}
