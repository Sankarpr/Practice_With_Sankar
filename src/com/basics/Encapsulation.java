package com.basics;
//Wrapping of data and methods in to a single unit Encapsulation
//All variables should be private
//For every variable there should be 2 methods(get and set)
//Variables can be operated only thorough methods
public class Encapsulation {
    private int acno;
    private String name;
    private double amount;

    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setAcno(101);
        obj.setAmount(1000.10);
        obj.setName("Sankar");
        System.out.println(obj.getAcno());

    }

}
