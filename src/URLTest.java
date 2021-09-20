import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLTest {

    @Test
    void isGUID6() {
        StringChecking url = new StringChecking("http://abc");
        Assertions.assertTrue(url.isURL());
    }
}