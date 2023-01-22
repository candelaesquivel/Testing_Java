package javaTestPackage.util;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weak_when_has_only_letters() {
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefghjk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        Assert.assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        Assert.assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}