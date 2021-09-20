package tests;

import tasks.StringChecking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class URLTest {

    @Test
    void isGUID6() {
        StringChecking url = new StringChecking("http://abc");
        Assertions.assertTrue(url.isURL());
    }
}