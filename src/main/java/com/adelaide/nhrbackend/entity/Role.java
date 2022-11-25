package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Role extends BaseEntity{
    private String role_name;
    private String title;
}
