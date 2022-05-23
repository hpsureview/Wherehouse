package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.User_Werehouse;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = User_Werehouse.class)
public interface Custom_User_Wherehouse {
    Integer getUser_id();
    Integer getWherehouse_id();
}
