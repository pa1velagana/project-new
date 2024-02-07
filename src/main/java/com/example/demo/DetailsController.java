package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    private DetailsRepository detailsRepository;

    @PostMapping("/add")
    public String addDetails(@RequestBody Details details) {
        detailsRepository.save(details);
        return "Details saved successfully!";
    }
}
