package com.adelaide.nhrbackend.repository;

import com.adelaide.nhrbackend.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, String> {

    @Override
    Optional<Hotel> findById(String id);

    Optional<Hotel> findByName(String name);

    Optional<Hotel> findByCityId(String cityId);

    Optional<Hotel> findByMark(double mark);
}
