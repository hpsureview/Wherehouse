package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment_center;
import com.example.vazifa_1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Currency.class)
public interface Custom_Currency {
    Integer getId();
    String getName();
    Boolean getActive();

}
