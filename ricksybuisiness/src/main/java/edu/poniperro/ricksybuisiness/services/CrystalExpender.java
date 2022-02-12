package edu.poniperro.ricksybuisiness.services;

import edu.poniperro.ricksybuisiness.creditCard.CreditCard;

public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard tarjeta) {
        if (stock() > 0 && tarjeta.pay(stock())) {
            this.stock -= 1;
        } else {
            System.out.println(tarjeta.credit());
        }

    }

    @Override
    public String toString() {
        return "Stock : " + stock() + "\ncost: " + this.itemCost;
    }

    public int stock() {
        return this.stock;
    }
}
