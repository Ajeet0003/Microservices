package com.rating.service.service.impl;

import com.rating.service.service.RatingService;
import com.rating.service.entiries.Rating;
import com.rating.service.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    /**
     * @param hotel
     * @return
     */
    @Override
    public Rating saveRating(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepository.save(rating);
    }

    /**
     * @return 
     */
    @Override
    public List<Rating> getAllRating() {

        return ratingRepository.findAll();
    }

    /**
     * @param userId 
     * @return
     */
    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    /**
     * @param hotelId 
     * @return
     */
    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    /**
     * @param userId 
     * @return
     */
//    @Override
//    public Rating getRating(String id) {
//        return ratingRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Rating with given id is not found on server !! : "+id));
//    }
}
