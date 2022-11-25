package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Room extends BaseEntity{
    private String hotel_id;
    private String type;
    private String description;
}
