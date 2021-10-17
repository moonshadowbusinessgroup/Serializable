package com.hadimusthafa.serializable;

import java.io.Serializable;

public class Test implements Serializable {

    String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
