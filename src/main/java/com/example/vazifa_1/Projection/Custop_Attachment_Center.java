package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment;
import com.example.vazifa_1.entity.Attachment_center;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Projection(types = Attachment_center.class)
public interface Custop_Attachment_Center {
    Integer getId();
    int getByte1();
    int getAttachment_id();

}
