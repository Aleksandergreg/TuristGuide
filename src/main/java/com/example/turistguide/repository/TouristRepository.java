package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    List<TouristAttraction> touristAttractionList = new ArrayList<>(List.of(new TouristAttraction("Bakkens Hvile", "Stort"),
            new TouristAttraction("Tivoli", "Stort men dyrt")));

    public List<TouristAttraction> getTouristAttractionList() {
        return touristAttractionList;
    }
    public TouristAttraction addTouristAttraction(TouristAttraction touristAttraction){
       touristAttractionList.add(touristAttraction);
       return touristAttraction;

    }
}
