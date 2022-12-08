package com.adelaide.nhrbackend.service;

import com.adelaide.nhrbackend.entity.Hotel;

public interface HotelService {

    Hotel getById(String id);

    Hotel getByName(String name);

    Hotel getByCityId(String cityId);

    Hotel getByMark(double mark);

}
