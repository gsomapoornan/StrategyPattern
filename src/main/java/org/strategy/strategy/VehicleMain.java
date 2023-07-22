package org.strategy.strategy;

public class VehicleMain {


    public TransmissionStrategy transmissionStrategy;
    public VehicleMain(TransmissionStrategy transmissionStrategy) {
        this.transmissionStrategy = transmissionStrategy;
    }

    public String drive()
    {

        return this.transmissionStrategy.drive();
    }

    public static void main(String[] args) {
        BMWCar bmwCar=new BMWCar(new SuperCar());
        AudiCar audiCar=new AudiCar(new SuperCar());
        MarutiCar marutiCar=new MarutiCar(new RegularCar());

        System.out.println("BMW Car."+bmwCar.drive());
        System.out.println("Maruti Car."+marutiCar.drive());
        System.out.println("Audi car."+audiCar.drive());
    }

}
