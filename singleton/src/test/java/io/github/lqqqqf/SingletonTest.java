/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf;

import io.github.lqqqqf.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        Assert.assertTrue(Singleton.getInstance()==Singleton.getInstance());
    }
}
