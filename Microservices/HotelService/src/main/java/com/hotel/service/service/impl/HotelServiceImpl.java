package com.hotel.service.service.impl;

import com.hotel.service.entiries.Hotel;
import com.hotel.service.service.HotelService;
import com.hotel.service.exception.ResourceNotFoundException;
import com.hotel.service.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    /**
     * @param hotel
     * @return
     */
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    /**
     * @return 
     */
    @Override
    public List<Hotel> getAllHotel() {

        return hotelRepository.findAll();
    }

    /**
     * @param userId 
     * @return
     */
    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found on server !! : "+id));
    }
}
