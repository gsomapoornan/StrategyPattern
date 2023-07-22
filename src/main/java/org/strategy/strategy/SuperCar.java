package org.strategy.strategy;

public class SuperCar implements TransmissionStrategy{
    @Override
    public String drive() {
        return "this is super car. auto transmission.";
    }
}
