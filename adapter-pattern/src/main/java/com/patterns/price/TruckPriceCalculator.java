package com.patterns.price;

/**
 * Stores the truck details.
 */
public class TruckPriceCalculator implements PriceCalculator{
    private Brand brand;

    public TruckPriceCalculator(Brand brand){
        this.brand = brand;
    }

    /**
     * Calculate the truck price regarding its brand.
     * @return The final price.
     */
    @Override
    public String calculatePrice() {
        return switch (brand){
            case MERCEDES -> "This truck costs 30 000 dollars";
            case BMW -> "This truck costs 40 000 dollars";
            case FOR -> "This truck costs 50 000 dollars";
            case TOYOTA -> "This truck costs 60 000 dollars";
        };
    }
}
