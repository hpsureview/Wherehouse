package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Category.class)
public interface Custom_Catagory {
    Integer getId();
    String getName();
    int getParent_catagory_id();
    boolean getActive();
}
