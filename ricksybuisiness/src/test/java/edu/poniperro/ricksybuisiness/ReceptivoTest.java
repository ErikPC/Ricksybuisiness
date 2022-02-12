package edu.poniperro.ricksybuisiness;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;
import edu.poniperro.ricksybuisiness.receptivo.Receptivo;
import edu.poniperro.ricksybuisiness.services.UfosPark;

import org.junit.Test;

public class ReceptivoTest {
    Receptivo clown = new Receptivo();
    UfosPark ufos = new UfosPark();
    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    @Test
    public void registraTest() {
        clown.registra(ufos);
    }

    @Test
    public void dispatchTest() {
        clown.registra(ufos);
        clown.dispatch(abradolph);
    }
}
