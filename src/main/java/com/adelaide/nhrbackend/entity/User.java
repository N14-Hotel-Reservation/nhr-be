package com.adelaide.nhrbackend.entity;

import com.adelaide.nhrbackend.enums.Gender;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
public class User extends BaseEntity{
    @Column(unique = true)
    private String username;

    private String password;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
