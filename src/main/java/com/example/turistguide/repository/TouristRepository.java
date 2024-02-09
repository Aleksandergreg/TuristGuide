package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class TouristRepository {
    List<TouristAttraction> touristAttractionList = new ArrayList<>(List.of(
            new TouristAttraction("Bakkens Hvile", "Stort"),
            new TouristAttraction("Tivoli", "Stort men dyrt"),
            new TouristAttraction("Rundetårn", "Højt og flot")));

    public List<TouristAttraction> getTouristAttractionList() {
        return touristAttractionList;
    }
    public TouristAttraction addTouristAttraction(TouristAttraction touristAttraction) {
        touristAttractionList.add(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction findTouristAttraction(String nameToSearchFor) {
        for (TouristAttraction touristAttraction : touristAttractionList) {
            if (touristAttraction.getName().equalsIgnoreCase(nameToSearchFor)) {
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction changeAttraction(TouristAttraction touristAttraction){
        int i = 0;
        while (i < touristAttractionList.size()){
            if (Objects.equals(touristAttraction.getName(), touristAttractionList.get(i).getName())){
                touristAttractionList.set(i, touristAttraction);
            }
            i++;
        }return null;
    }

    public TouristAttraction deleteAttraction(TouristAttraction touristAttraction){
        int foundIndex = -1;
        TouristAttraction touristAttractionToDelete = new TouristAttraction(touristAttraction.getName(),touristAttraction.getDescription());
        for (int i = 0; i <touristAttractionList.size(); i++){
            if (touristAttraction.getName() == touristAttractionList.get(i).getName()){
                foundIndex = i;
            }
        }if (foundIndex != -1){
            touristAttractionToDelete = touristAttractionList.get(foundIndex);
            touristAttractionList.remove(foundIndex);
        }
        return touristAttractionToDelete;
    }

    public TouristAttraction deleteAttractionTest(String nameToDelete) {
        TouristAttraction attractionToDelete = findTouristAttraction(nameToDelete);
        if (attractionToDelete != null) {
            touristAttractionList.remove(attractionToDelete);
            return attractionToDelete;
        } else {
            return null;
        }
    }
}
