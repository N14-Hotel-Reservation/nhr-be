package com.adelaide.nhrbackend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class RoomStatus extends BaseEntity{
    private String room_type_id;
}
