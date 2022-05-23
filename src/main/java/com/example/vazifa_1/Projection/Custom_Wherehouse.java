package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Wherehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Wherehouse.class)
public interface Custom_Wherehouse {
    Integer getId();
    String getName();
    boolean getActive();
}
