package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

@Entity
@Data
public class Room extends BaseEntity{
    private String hotel_id;
    private String type;

    private String description;
}
