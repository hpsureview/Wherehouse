package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Wherehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "wherehouse" , collectionResourceRel = "List", excerptProjection = Wherehouse.class)

public interface Wherehouse_Repos extends JpaRepository<Wherehouse,Integer> {
}
