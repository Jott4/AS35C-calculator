package com.company;

public class Exponenciacao implements Operator  {
    public double calcula(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}
