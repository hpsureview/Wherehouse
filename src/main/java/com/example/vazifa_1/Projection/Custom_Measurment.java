package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Measurment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurment.class)
public interface Custom_Measurment {
    Integer getId();
    String getName();
    boolean getActive();
}
