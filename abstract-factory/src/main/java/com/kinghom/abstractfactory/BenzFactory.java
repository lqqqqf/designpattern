package com.kinghom.abstractfactory;

public class BenzFactory implements VehicleFactory {
    @Override
    public Bodywork createBodywork() {
        return new BenzBodywork();
    }

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }
}
