package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.sql.Blob;

@Entity
@Data
public class Hotel extends BaseEntity{
    private String cityId;

    private String name;
    private String address;
    private Double mark;
    private Double latitude;
    private Double longitude;
//    private Blob pricture;
}
