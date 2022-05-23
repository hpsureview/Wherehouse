package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.User;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = User.class)
public interface Custom_User {
    Integer getId();
    String getFirst_name();
    String getLast_name();
    int getPhone_number();
    int getCode();
    String getPassword();
    boolean getActive();
}
