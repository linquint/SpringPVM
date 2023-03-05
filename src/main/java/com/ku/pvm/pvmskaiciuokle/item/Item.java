package com.ku.pvm.pvmskaiciuokle.item;

public class Item {
    private String name;
    private double price;
    private int amount;

    public Item(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return round(this.amount * this.price, 2);
    }

    public double getVAT(boolean total) {
        if (total) return round(this.getVAT(false) * this.amount, 2);
        return round(Math.round(price * 0.21 * 100) / 100.0, 2);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double round(double number, int decimals) {
        if (decimals == 0) {
            return ((int) number + ((number % 1 < 0.5) ? 0 : 1));
        }

        float mul = 1;
        for (int i = 1; i <= decimals; i++) {
            mul *= 10;
        }

        number = (float) number * mul;
        return ((((int) number) * 1.0 + ((number % 1 < 0.5) ? 0 : 1)) / mul);
    }
}
