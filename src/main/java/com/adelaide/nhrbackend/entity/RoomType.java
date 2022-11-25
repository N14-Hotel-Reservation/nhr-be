package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class RoomType extends BaseEntity {
    private String title;

    private String description;
}
