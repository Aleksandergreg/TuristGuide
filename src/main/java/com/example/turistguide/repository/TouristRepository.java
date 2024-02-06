package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    List<TouristAttraction> touristAttractionList = new ArrayList<>(List.of(new TouristAttraction("Bakkens Hvile", "Stort")));
}
