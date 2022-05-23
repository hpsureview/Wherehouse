package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Output;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output" , collectionResourceRel = "List", excerptProjection = Custom_Output.class)

public interface Output_Repos extends JpaRepository<Output,Integer> {
}
