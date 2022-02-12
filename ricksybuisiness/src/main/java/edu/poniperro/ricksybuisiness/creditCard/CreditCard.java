package edu.poniperro.ricksybuisiness.creditCard;

public class CreditCard {
    private String owner;
    private String number;
    private double credit = 3000;
    private String SYMBOL = "EZI";

    public CreditCard(String dueño, String numero) {
        this.owner = dueño;
        this.number = numero;
    }

    public boolean pay(double pago) {
        if (pago <= credit()) {
            this.credit = credit() - pago;
            return true;
        } else {
            return false;
        }
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }

    @Override
    public String toString() {
        return "owner: " + this.owner
                + "\nnumer: " + number()
                + "\ncredit: " + credit() + SYMBOL;
    }
}
