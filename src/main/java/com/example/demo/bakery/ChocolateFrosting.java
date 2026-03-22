package com.example.demo.bakery;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting {
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}