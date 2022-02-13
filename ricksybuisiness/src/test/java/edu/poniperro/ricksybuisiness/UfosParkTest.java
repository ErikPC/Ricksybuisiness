package edu.poniperro.ricksybuisiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;
import edu.poniperro.ricksybuisiness.services.UfosPark;

public class UfosParkTest {

    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    CreditCard morty = new CreditCard("Morty", "0000000000000000");
    UfosPark estadosUnidos = new UfosPark();

    @Test
    public void dispatchTest() {
        estadosUnidos.add("unox");
        estadosUnidos.add("dox");
        estadosUnidos.dispatch(abradolph);
        morty.pay(3000);
        estadosUnidos.dispatch(morty);
        estadosUnidos.dispatch(abradolph);
    }

    @Test
    public void getUfoOfTest() {
        estadosUnidos.dispatch(abradolph);
        assertEquals("null", estadosUnidos.getUfoOf("4916119711304546"));
    }

    @Test
    public void toStringTest() {
        estadosUnidos.add("unox");
        assertEquals("[unox]", estadosUnidos.toString());
    }
}
