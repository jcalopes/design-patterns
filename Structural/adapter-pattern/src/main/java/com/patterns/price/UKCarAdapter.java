package com.patterns.price;

import org.example.UKCarPriceCalculator;

public class UKCarAdapter implements PriceCalculator {
    private final UKCarPriceCalculator ukCarPriceCalculator;

    public UKCarAdapter(UKCarPriceCalculator ukCarPriceCalculator){
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public String calculatePrice() {
        return "The UKCar costs around " + ukCarPriceCalculator.getPrice();
    }
}
