package Notes08_24_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CashRegisterTest {

    @Test
    void recordPurchase() {
    }

    @Test
    void receivePayment() {
    }

    @Test
    void giveChange() {
    }

    @Test
    void testRecordPurchase() {
    }

    @Test
    void testReceivePayment() {
    }

    @Test
    void testGiveChange() {
        CashRegister register = new CashRegister();
        register.recordPurchase(0.75);
        register.recordPurchase(1.5);
        register.receivePayment(2, new Coin(1, "Dollar"));
        register.receivePayment(5, new Coin(0.05, "Nickle"));
        double expected = 0.00;
        assertEquals(expected, register.giveChange(), 0.0000001);
    }
}