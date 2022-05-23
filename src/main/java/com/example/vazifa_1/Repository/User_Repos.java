package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_User;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user" , collectionResourceRel = "List", excerptProjection = Custom_User.class)

public interface User_Repos extends JpaRepository<User,Integer> {
}
