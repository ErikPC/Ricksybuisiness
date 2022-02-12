package edu.poniperro.ricksybuisiness.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;

public class UfosPark implements GuestDispatcher {
    private double fee = 500.0;
    private Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {

    }

    public void add(String ufo) {
        flota.put(ufo, null);
    }

    public void dispatch(CreditCard tarjeta) {
        if (flota.containsValue(tarjeta.number())) {
            return;
        }
        Optional<String> libre = flota.entrySet().stream()
                .filter(u -> u.getValue() == null)
                .map(u -> u.getKey())
                .findAny();
        if (libre.isPresent() && tarjeta.pay(fee)) {
            flota.put(libre.get(), tarjeta.number());
        }
    }

    public String getUfoOf(String cardNumber) {
        Optional<String> ufo = flota.entrySet().stream()
                .filter(u -> u.getValue() == cardNumber)
                .map(u -> u.getKey())
                .findAny();
        return ufo.isPresent() ? ufo.get() : "null";
    }

    @Override
    public String toString() {
        return flota.keySet().toString();
    }
}
