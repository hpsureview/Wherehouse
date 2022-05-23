package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Output_product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Output_product.class)
public interface Custom_output_product {
    Integer getId();
    int getProduct_id();
    int getamount();
    int getPrice();
    int getOutput_id();
}
