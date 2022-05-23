package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Product.class)
public interface Custom_Product {
    Integer getId();
    String getName();
    int getCategory_id();
    int getPhoto_id();
    int getMeasurment_idCode();
    int getMeasurment_id();
    boolean getActive();
}
