/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.prototype;

import java.util.Date;

public class Prototype implements Cloneable {
    private String name;
    private Date date;

    public Prototype(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
