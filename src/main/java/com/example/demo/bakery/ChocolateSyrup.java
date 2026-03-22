package com.example.demo.bakery;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup {
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}