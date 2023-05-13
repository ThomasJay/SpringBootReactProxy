package com.thomasjayconsutling.springbootapi.controller;

import com.thomasjayconsutling.springbootapi.model.Address;
import com.thomasjayconsutling.springbootapi.model.Item;
import com.thomasjayconsutling.springbootapi.model.SampleDataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/api/v1")
public class SampleDataRestController {

    @GetMapping("/sampleData")
    public SampleDataResponse sampleData() {

        SampleDataResponse sampleDataResponse = new SampleDataResponse("1234-333-222", "Tom Jay", "tom@thomasjayconsutling.com",
        new Address("100 A Street", "Lincoln", "Ca", "95648", "USA"), Arrays.asList(
                new Item("22-3AAs-1", "Sandwich", "Turkey Sandwich", 8.00, 1, "Each"),
                new Item("22-3AAs-2", "Pizza", "Yummy Pizzal", 5.00, 1, "Slide"),
                new Item("22-3AAs-3", "Pepsi", "Pepsi 8 ounce soda", 1.00, 2, "Can")));

        return sampleDataResponse;
    }
}
