import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongPasswordTest {

    @Test
    void isStrongPassword1() {
        StringChecking password = new StringChecking("_Ge6__effP");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword2() {
        StringChecking password = new StringChecking("AB994OB8800USooo");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword3() {
        StringChecking password = new StringChecking("u__8AsdfA_");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword4() {
        StringChecking password = new StringChecking("hcO_O9C984_k");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword5() {
        StringChecking password = new StringChecking("9As____fdokgFG5");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword6() {
        StringChecking password = new StringChecking("946a_S654SSSS");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword7() {
        StringChecking password = new StringChecking("pAsSwor8");
        Assertions.assertTrue(password.isStrongPassword());
    }

    @Test
    void isStrongPassword8() {
        StringChecking password = new StringChecking("8nK");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword9() {
        StringChecking password = new StringChecking("PIP3ins");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword10() {
        StringChecking password = new StringChecking("Ii3r");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword11() {
        StringChecking password = new StringChecking("99BIgba");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword12() {
        StringChecking password = new StringChecking("Bo846ba");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword13() {
        StringChecking password = new StringChecking("X__eXeXeXeXeXe");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword14() {
        StringChecking password = new StringChecking("call_88005553535");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword15() {
        StringChecking password = new StringChecking("1AXAXA_XAXAX_AX1");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword16() {
        StringChecking password = new StringChecking("dkdf:987F");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword17() {
        StringChecking password = new StringChecking("?TUeres7");
        Assertions.assertFalse(password.isStrongPassword());
    }

    @Test
    void isStrongPassword18() {
        StringChecking password = new StringChecking("amo!es7to*");
        Assertions.assertFalse(password.isStrongPassword());
    }
}