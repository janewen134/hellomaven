package com.jingwen;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd() {
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(20,30);
        Assert.assertEquals(50, res);
    }

}
