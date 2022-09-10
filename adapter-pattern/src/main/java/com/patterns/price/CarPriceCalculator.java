package com.patterns.price;

/**
 * Implementation of Price Calculator store information about a car.
 */
public class CarPriceCalculator implements PriceCalculator{

    private Brand brand;

    public CarPriceCalculator(Brand brand){
        this.brand = brand;
    }

    /**
     * Calculates the price of the car regarding its brand.
     * @return The price.
     */
    @Override
    public String calculatePrice() {
        return switch (brand){
            case MERCEDES -> "This car costs 30 000 dollars";
            case BMW -> "This car costs 40 000 dollars";
            case FOR -> "This car costs 50 000 dollars";
            case TOYOTA -> "This car costs 60 000 dollars";
        };
    }
}
