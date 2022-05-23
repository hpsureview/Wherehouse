package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Input;
import com.example.vazifa_1.entity.Input_product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import java.util.Date;

@Projection(types = Input_product.class)
public interface Custom_Input_product {
    Integer getId();
    int getProduct_id();
    int getAmount();
    int getPrice();
    Date getExpire_date();
    int getInput_id();
}
