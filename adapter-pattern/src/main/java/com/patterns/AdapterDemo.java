package com.patterns;


import com.patterns.price.Brand;
import com.patterns.price.CarPriceCalculator;
import com.patterns.price.PriceCalculator;
import com.patterns.price.UKCarAdapter;
import org.example.UKCarPriceCalculator;

public class AdapterDemo
{
    public static void main( String[] args )
    {
        PriceCalculator vehicle1 = new CarPriceCalculator(Brand.BMW);
        PriceCalculator vehicle2 = new CarPriceCalculator(Brand.TOYOTA);

        //Adapter is useful when you don't want to touch in the third-party class or it´s not allowed to access to.
        //We create an adapter to still be able to work with the UKCarPriceCalculator.
        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW", 15);
        PriceCalculator vehicle3 = new UKCarAdapter(ukCarPriceCalculator);

        System.out.println(printVehiclePrice(vehicle1));
        System.out.println(printVehiclePrice(vehicle2));
        System.out.println(printVehiclePrice(vehicle3));
    }

    /**
     * This method print a vehicle price. Receive as a parameter PriceCalculator as an interface. So we can use all of
     * its implementations such as TruckPriceCalculator and CarPriceCalculator. However, I want to calculate the price
     * of UK car and for this I have available one dependency that makes this calculus for me, but I can use its class because
     * it's not allowed here. So this when adapter comes in to the picture. So as you can see I am able to use this method along with
     * UKCarPriceCalculator by creating an adapter(lines 19,20,24).
     * @param priceCalculator
     * @return Price Vehicle.
     */
    public static String printVehiclePrice(PriceCalculator priceCalculator){
        return priceCalculator.calculatePrice();
    }
}
