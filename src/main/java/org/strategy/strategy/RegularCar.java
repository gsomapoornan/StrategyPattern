package org.strategy.strategy;

public class RegularCar implements TransmissionStrategy{
    @Override
    public String drive() {
        return "This is regular car.manual transmission";
    }
}
