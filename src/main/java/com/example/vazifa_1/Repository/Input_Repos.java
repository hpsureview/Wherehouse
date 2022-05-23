package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Input;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Input.class)

public interface Input_Repos extends JpaRepository<Input,Integer> {
}
