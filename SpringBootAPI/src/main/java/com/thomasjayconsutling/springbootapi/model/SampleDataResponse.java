package com.thomasjayconsutling.springbootapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleDataResponse {
    private String id;
    private String name;
    private String email;
    private Address address;
    private List<Item> items;

}
