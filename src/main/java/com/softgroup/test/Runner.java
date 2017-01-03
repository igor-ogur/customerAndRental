package com.softgroup.test;

public class Runner {
    public static void main( String[] args ){
        Rental rental = new Rental(4, 4, 100);
        Customer customer1 = new Customer("Ivan", rental);

        System.out.println(customer1.getName() +" "+ customer1.getRental().amountFor());
    }
}
