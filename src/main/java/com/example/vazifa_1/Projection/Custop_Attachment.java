package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = Attachment.class)
public interface Custop_Attachment {
     Integer getId();

     String getName();

     Integer getSize();

     String getContent_type();
}
