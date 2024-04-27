package ru.itis.inf304.lab7;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    @Test
    public void testExp(){
        double r = MathUtil.exp(0.0);
        double epsylon = 0.000001;
        Assert.assertEquals(1,r,epsylon);
        Assert.assertEquals(Math.exp(1d),MathUtil.exp(1d),epsylon);
    }

}