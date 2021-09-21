package tests;

import tasks.StringChecking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GUIDTest {

    @Test
    void isGUID1() {
        StringChecking guid = new StringChecking("e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID2() {
        StringChecking guid = new StringChecking("{ffffffff-ffff-ffff-ffff-ffffffffffff}");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID3() {
        StringChecking guid = new StringChecking("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID4() {
        StringChecking guid = new StringChecking("{11111111-1111-1111-1111-111111111111}");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID5() {
        StringChecking guid = new StringChecking("aA12bB34-5cC5-6dD7-8eE9-0fFabC568fDc");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID6() {
        StringChecking guid = new StringChecking("e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID7() {
        StringChecking guid = new StringChecking("11111111-aaaa-DDDD-0000-CCCCCC555555");
        Assertions.assertTrue(guid.isGUID());
    }

    @Test
    void isGUID8() {
        StringChecking guid = new StringChecking("g02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID9() {
        StringChecking guid = new StringChecking("G02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID10() {
        StringChecking guid = new StringChecking(":e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID11() {
        StringChecking guid = new StringChecking("e02fd0e4-00fd-090A-ca30-0d00a003{8ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID12() {
        StringChecking guid = new StringChecking("e02Nd0e4-00fd-0M0A-ca30-0d00a003f8ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID13() {
        StringChecking guid = new StringChecking("e02fd0e4-00fd-090A-ca3N-0d00a003{8ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID14() {
        StringChecking guid = new StringChecking("e02*d0e4-00fd-090A-ca30-0d00a003{8ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID15() {
        StringChecking guid = new StringChecking("e02fd0e400fd-090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID16() {
        StringChecking guid = new StringChecking("e02fd0e400fd-090A-ca30--0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID17() {
        StringChecking guid = new StringChecking("e02fd0e400fd 090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID18() {
        StringChecking guid = new StringChecking("e02fd0e400f-090A-ca30-0d00a0038ba0");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID19() {
        StringChecking guid = new StringChecking("{(}aA12bB34-5cC5-6dD7-8eE9-0fFabC568fDc");
        Assertions.assertFalse(guid.isGUID());
    }

    @Test
    void isGUID20() {
        StringChecking guid = new StringChecking("aA12bB34-5cC5-6dD7-8eE9-0fFabC568fDc}");
        Assertions.assertFalse(guid.isGUID());
    }
}