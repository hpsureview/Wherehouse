package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Attachment;
import com.example.vazifa_1.entity.Attachment_center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment_center" , collectionResourceRel = "List", excerptProjection = Attachment_center.class)

public interface Attachment_center_Repos extends JpaRepository<Attachment_center,Integer> {
}
