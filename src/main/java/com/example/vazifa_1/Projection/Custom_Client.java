package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Client;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Client.class)
public interface Custom_Client {
    Integer getId();
    String getName();
    String getPhone_number();
}
