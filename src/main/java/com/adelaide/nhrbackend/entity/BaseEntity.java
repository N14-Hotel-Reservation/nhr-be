package com.adelaide.nhrbackend.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;

    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;


}
