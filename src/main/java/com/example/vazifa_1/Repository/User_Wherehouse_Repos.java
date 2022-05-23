package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_User_Wherehouse;
import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.User_Werehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "userWherehouse" , collectionResourceRel = "List", excerptProjection = Custom_User_Wherehouse.class)

public interface User_Wherehouse_Repos extends JpaRepository<User_Werehouse,Integer> {
}
