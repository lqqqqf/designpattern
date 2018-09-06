package com.kinghom.abstractfactory;

public class BmwFactory implements VehicleFactory {
    @Override
    public Bodywork createBodywork() {
        return new BmwBodywork();
    }

    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }
}
