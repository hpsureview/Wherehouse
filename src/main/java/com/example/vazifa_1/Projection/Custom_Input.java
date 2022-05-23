package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Input;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import java.util.Date;

@Projection(types = Input.class)
public interface Custom_Input {
    Integer getId();
    Date getDate();
    int getWherehouse_id();
    int getSupplier_id();
    int getCurrency_id();
    int getFacture_number();
    int getCode();
}
