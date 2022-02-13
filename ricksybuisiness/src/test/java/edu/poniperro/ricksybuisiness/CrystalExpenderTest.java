package edu.poniperro.ricksybuisiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;
import edu.poniperro.ricksybuisiness.services.CrystalExpender;

public class CrystalExpenderTest {

    CrystalExpender benyard = new CrystalExpender(9, 5.5);
    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    @Test
    public void stockTest() {
        assertEquals(9, benyard.stock());
    }

    @Test
    public void dispatchTest() {
        benyard.dispatch(abradolph);
        assertEquals(8, benyard.stock());
        CrystalExpender alejandro = new CrystalExpender(0, 0.50);
        alejandro.dispatch(abradolph);
        assertEquals(0, alejandro.stock());
    }

    @Test
    public void toStringTest() {
        assertEquals("Stock : 9\ncost: 5.5", benyard.toString());
    }
}
