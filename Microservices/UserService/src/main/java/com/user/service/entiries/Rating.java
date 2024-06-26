package com.user.service.entiries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private  String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String remarks;
    private String feedback;
}
