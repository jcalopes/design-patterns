package com.patterns.price;

/**
 * Abstraction to calculate a price.
 */
public interface PriceCalculator {

    /**
     * Calculate a specific price and return the amount in String format.
     * @return The final price.
     */
    String calculatePrice();
}
