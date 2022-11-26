package com.adelaide.nhrbackend.entity;

import com.adelaide.nhrbackend.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User extends BaseEntity{

    @Column(unique = true)
    private String username;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String password;

    private String nickname;

    private Boolean ifLocked;

    private Boolean ifEnable;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
