package com.rating.service.controller;

import com.rating.service.service.RatingService;
import com.rating.service.entiries.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService hotelService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating hotel1= hotelService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        List<Rating> ratings= hotelService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratings);
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        List<Rating> ratings= hotelService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratings);
    }
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> ratings= hotelService.getAllRating();
        return ResponseEntity.ok(ratings);
    }
}
