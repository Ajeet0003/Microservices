package com.rating.service.service;

import com.rating.service.entiries.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(String id);
}
