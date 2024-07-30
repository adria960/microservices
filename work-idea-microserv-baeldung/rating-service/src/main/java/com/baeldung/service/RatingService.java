package com.baeldung.service;

import com.baeldung.model.Rating;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RatingService {

    private static final Map<Integer, Rating> ratings = new HashMap<Integer, Rating>() {

        private static final long serialVersionUID = -3970206781360313502L;

        {
            put(11, new Rating(11, 111L, 4));
            put(22, new Rating(22, 222L, 5));
        }
    };

    public List<Rating> findAllRatings() {
        return ratings.values().stream().collect(Collectors.toList());
    }

    public List<Rating> findRatingsByBookId(Long bookId) {
        if (ratings.containsKey(bookId)) {
            return ratings.values().stream().collect(Collectors.toList());
        }
        return null;
    }

    public Rating createRating(Rating rating) {
        Rating ratingNew = new Rating(getRandomNumber(), rating.getBookId(), rating.getStars());
        ratings.put(getRandomNumber(), rating);
        return rating;
    }

    public void deleteRating(Long ratingId) {
        ratings.remove(ratingId);
    }

    //Put
    public Rating updateRating(Rating rating, Long ratingId) {
        Rating updateRating = ratings.get(ratingId);
        updateRating.setBookId(rating.getBookId());
        updateRating.setStars(rating.getStars());
        ratings.replace(ratingId.intValue(), updateRating);
        return updateRating;
    }

    //Patch
    public Rating updateRating(Map<String, String> rating, Long ratingId) {
        return null;
    }

    public static int getRandomNumber() {
        int x = (int) Math.random();
        return x;
    }
}

   /*
    List<String> result2 = map.values().stream()
                .collect(Collectors.toList());
    result2.forEach(System.out::println);
    */