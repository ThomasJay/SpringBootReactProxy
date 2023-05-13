package com.thomasjayconsutling.springbootapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String line1;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
