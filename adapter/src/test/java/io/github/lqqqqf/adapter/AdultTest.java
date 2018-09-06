/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.adapter;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AdultTest {

    @Test
    public void test() {
        Adult jack = new Adult(new ToyotaAdapter(new Toyota()));
        ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
        PrintStream cacheStream = new PrintStream(baoStream);
        System.setOut(cacheStream);
        jack.travel();
        String strMsg = baoStream.toString();
        Assert.assertEquals("开丰田\n", strMsg);
    }
}
