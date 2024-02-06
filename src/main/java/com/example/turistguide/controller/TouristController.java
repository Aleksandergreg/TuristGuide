package com.example.turistguide.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {

    @GetMapping("/attractions")
    public ResponseEntity<List<TouristAttraction>> getAttractions() {
        return null;
    }

    @GetMapping("/attractions/{name}")
    public ResponseEntity<List<TouristAttraction>> getAttractionsByName() {
        return null;
    }

    @

}
