package com.adelaide.nhrbackend.service.serviceImpl;

import com.adelaide.nhrbackend.entity.Hotel;
import com.adelaide.nhrbackend.repository.HotelRepository;
import com.adelaide.nhrbackend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel getById(String id) {
        Optional<Hotel> hotel = hotelRepository.findById(id);
        if (!hotel.isPresent()) {
            //TODO
        }
        return hotel.get();
    }

    @Override
    public Hotel getByName(String name) {
        Optional<Hotel> hotel = hotelRepository.findByName(name);
        if (!hotel.isPresent()) {
            //TODO
        }
        return hotel.get();
    }

    @Override
    public Hotel getByCityId(String cityId) {
        Optional<Hotel> hotel = hotelRepository.findByCityId(cityId);
        if (!hotel.isPresent()) {
            //TODO
        }
        return hotel.get();
    }

    @Override
    public Hotel getByMark(double mark) {
        Optional<Hotel> hotel = hotelRepository.findByMark(mark);
        if (!hotel.isPresent()){
            //TODO
        }
        return hotel.get();
    }
}
