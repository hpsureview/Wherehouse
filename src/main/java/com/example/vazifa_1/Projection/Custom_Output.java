package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import com.example.vazifa_1.entity.Output;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import java.util.Date;

@Projection(types = Output.class)
public interface Custom_Output {
    Integer getId();
    Date getDate();
    int getWarehouse_id();
    int  getCurrency_id();
    int  getFacture_number();
    int getCode();
    int  getClient_id();
}
