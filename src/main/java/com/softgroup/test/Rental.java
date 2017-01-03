package com.softgroup.test;

public class Rental {
    private int kind;
    private int days;
    private int basePrice;

    public Rental(int kind, int days) {
        this.kind = kind;
        this.days = days;
    }

    public Rental(int kind, int days, int basePrice) {
        this.kind = kind;
        this.days = days;
        this.basePrice = basePrice;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice){
        this.basePrice = basePrice;
    }

    public double amountFor() {
        double result;
        result = getDays() * getBasePrice();
        if (getKind() == 1) {
            result = result * 1.5;
        }
        if (getKind() == 2) {
            result = result * 2;
        }
        if (getKind() == 3) {
            result = result * 2.5;
        }
        if (getDays() > 7) {
            result = result * 3;
        }
        return result;
    }
}
