package com.adelaide.nhrbackend.controller;

import com.adelaide.nhrbackend.entity.Hotel;
import com.adelaide.nhrbackend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/hotels/${hotelId}")
    public Hotel getHotelById(@PathVariable String hotelId) {
        return hotelService.getById(hotelId);
    }
}
