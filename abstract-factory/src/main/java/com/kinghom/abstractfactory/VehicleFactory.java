package com.kinghom.abstractfactory;

public interface VehicleFactory {

    Bodywork createBodywork();

    Engine createEngine();
}
