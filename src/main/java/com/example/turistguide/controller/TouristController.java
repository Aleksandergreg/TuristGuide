package com.example.turistguide.controller;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    private TouristService touristService;

    public TouristController() {
        this.touristService = new TouristService();
    }

    @GetMapping()
    public ResponseEntity<List<TouristAttraction>> getAttractions() {
        return new ResponseEntity<List<TouristAttraction>>(touristService.getTouristAttractionList(), HttpStatus.OK);
    }

    @GetMapping("/attractions/{name}")
    public ResponseEntity<List<TouristAttraction>> getAttractionsByName() {
        return null;
    }

   @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attractionToAdd) {
        TouristAttraction touristAttraction = touristService.postTouristAttraction(attractionToAdd);
        return new ResponseEntity<TouristAttraction>(touristAttraction, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttraction(TouristAttraction attractionToUpdate) {
        return null;
    }

    @GetMapping("/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(TouristAttraction attractionToDelete) {
        return null;
    }

}
