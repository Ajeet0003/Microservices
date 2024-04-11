package com.rating.service.service;

import com.rating.service.entiries.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Rating saveRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);

}
