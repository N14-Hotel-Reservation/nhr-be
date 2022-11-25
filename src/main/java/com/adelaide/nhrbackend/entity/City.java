package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class City extends BaseEntity{
    private String name;
    private String state;
    private String country;
}
