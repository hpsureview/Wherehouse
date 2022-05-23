package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Catagory;
import com.example.vazifa_1.Projection.Custom_Client;
import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Client" , collectionResourceRel = "List", excerptProjection = Custom_Client.class)

public interface Client_Repos extends JpaRepository<Client,Integer> {
}
