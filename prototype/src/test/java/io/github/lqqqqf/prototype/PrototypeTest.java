/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Prototype p = new Prototype("p", new Date());
        Prototype p1 = (Prototype) p.clone();
        Assert.assertTrue(p.getDate() == p1.getDate());
    }
}
