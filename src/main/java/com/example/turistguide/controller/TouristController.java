package com.example.turistguide.controller;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


    //Er ikke færdig
    @GetMapping(value = "/{name}")
    public ResponseEntity<TouristAttraction> getAttractionByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(touristService.findTouristAttraction(name), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attractionToAdd) {
        TouristAttraction touristAttraction = touristService.postTouristAttraction(attractionToAdd);
        return new ResponseEntity<TouristAttraction>(touristAttraction, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction attractionToUpdate) {
        TouristAttraction touristAttraction = touristService.updateTouristAttraction(attractionToUpdate);
        return new ResponseEntity<TouristAttraction>(touristAttraction, HttpStatus.OK);
    }

    @GetMapping("/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable("name") String attractionToDelete) {
        TouristAttraction touristAttraction = touristService.deleteTouristAttraction(attractionToDelete);
        return new ResponseEntity<TouristAttraction>(touristAttraction, HttpStatus.OK);
    }

}
