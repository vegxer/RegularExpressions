import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressTest {

    @Test
    void isIP1() {
        StringChecking ip = new StringChecking("192.168.0.1");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP2() {
        StringChecking ip = new StringChecking("0.0.0.0");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP3() {
        StringChecking ip = new StringChecking("255.255.255.255");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP4() {
        StringChecking ip = new StringChecking("1.1.1.1");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP5() {
        StringChecking ip = new StringChecking("24.240.1.0");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP6() {
        StringChecking ip = new StringChecking("0.1.199.251");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP7() {
        StringChecking ip = new StringChecking("199.19.25.2");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP8() {
        StringChecking ip = new StringChecking("9.255.240.0");
        Assertions.assertTrue(ip.isIP());
    }

    @Test
    void isIP9() {
        StringChecking ip = new StringChecking("255.256.255.255");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP10() {
        StringChecking ip = new StringChecking("01.123.35.4");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP11() {
        StringChecking ip = new StringChecking("25.005.6.144");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP12() {
        StringChecking ip = new StringChecking("1000.351.6.6");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP13() {
        StringChecking ip = new StringChecking("1.-1.2.6");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP14() {
        StringChecking ip = new StringChecking("0.00.0.0");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP15() {
        StringChecking ip = new StringChecking("...");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP16() {
        StringChecking ip = new StringChecking("255.255.255.255.");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP17() {
        StringChecking ip = new StringChecking("255.255.255.255q");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP18() {
        StringChecking ip = new StringChecking("q255.255.255.255");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP19() {
        StringChecking ip = new StringChecking("140...140");
        Assertions.assertFalse(ip.isIP());
    }

    @Test
    void isIP20() {
        StringChecking ip = new StringChecking("255..255.255.255");
        Assertions.assertFalse(ip.isIP());
    }

}