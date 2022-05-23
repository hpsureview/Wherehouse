package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment" , collectionResourceRel = "List", excerptProjection = Attachment.class)

public interface Attachment_Repos extends JpaRepository<Attachment,Integer> {
}
