/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.abstractfactory;

public interface VehicleFactory {

    Bodywork createBodywork();

    Engine createEngine();
}
