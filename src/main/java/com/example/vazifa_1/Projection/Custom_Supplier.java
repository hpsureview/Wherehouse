package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface Custom_Supplier {
    Integer getId();
    String getName();
    boolean getActive();
}
