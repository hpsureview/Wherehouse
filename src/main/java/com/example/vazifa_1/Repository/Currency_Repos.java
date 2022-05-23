package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Client;
import com.example.vazifa_1.Projection.Custom_Currency;
import com.example.vazifa_1.entity.Client;
import com.example.vazifa_1.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency" , collectionResourceRel = "List", excerptProjection = Custom_Currency.class)

public interface Currency_Repos extends JpaRepository<Currency,Integer> {
}
