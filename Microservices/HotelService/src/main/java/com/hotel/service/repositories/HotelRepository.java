package com.hotel.service.repositories;

import com.hotel.service.entiries.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
