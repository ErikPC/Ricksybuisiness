package edu.poniperro.ricksybuisiness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;

public class CreditCardTest {
    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    @Test
    public void payTest() {
        assertTrue(abradolph.pay(50));
    }

    @Test
    public void payInsuficienteTest() {
        assertFalse(abradolph.pay(30000));
    }

    @Test
    public void numberTest() {
        assertEquals("4916119711304546", abradolph.number());
    }

    @Test
    public void creditTest() {
        assertEquals(3000, abradolph.credit(), 0);
        abradolph.pay(1000);
        assertEquals(2000, abradolph.credit(), 0);
    }

    @Test
    public void toStringTest() {
        assertEquals("owner: Abradolph Lincler\nnumer: 4916119711304546\ncredit: 3000.0EZI", abradolph.toString());
    }
}
