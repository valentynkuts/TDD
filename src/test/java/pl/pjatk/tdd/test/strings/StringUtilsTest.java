package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.strings.StringUtils;


public class StringUtilsTest {
    @Test
    public void strIsPolindrom() {
        Assert.assertEquals(true, StringUtils.polindrom("qwelewq"));
    }

    @Test
    public void agaIsPolindrom() {
        Assert.assertEquals(true, StringUtils.polindrom("aga"));
    }

    @Test
    public void strIsNotPolindrom() {
        Assert.assertEquals(false, StringUtils.polindrom("A kilku tu klika"));
    }

    @Test
    public void sumOfDigits52Return7() {
        Assert.assertEquals(7, StringUtils.sumOfDigits("52"));
    }

    @Test
    public void sumOfDigits884Return20() {
        Assert.assertEquals(20, StringUtils.sumOfDigits("884"));
    }
}

