package com.example.turistguide.service;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService() {
        this.touristRepository = new TouristRepository();
    }

    public List<TouristAttraction> getTouristAttractionList() {
        return touristRepository.getTouristAttractionList();
    }
}
