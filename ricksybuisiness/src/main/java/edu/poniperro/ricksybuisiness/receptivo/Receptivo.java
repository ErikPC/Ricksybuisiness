package edu.poniperro.ricksybuisiness.receptivo;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;
import edu.poniperro.ricksybuisiness.services.GuestDispatcher;

public class Receptivo {
    private List<GuestDispatcher> observers = new ArrayList<GuestDispatcher>();

    public Receptivo() {
    }

    public void registra(GuestDispatcher servicio) {
        observers.add(servicio);
    }

    public void dispatch(CreditCard tarjeta) {
        // primerostream de la lista , despues lo que quieres hacer ,por cada
        // guestDistpacher haz guestDispatcher.dispatch
        observers.stream().forEach(g -> g.dispatch(tarjeta));
    }
}
