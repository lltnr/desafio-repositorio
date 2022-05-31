package org.example;

public class TestarCalcImposto {

    public static void main(String[] args) {
        CalcImposto.aliquota = 5;
        System.out.println(CalcImposto.calcImposto(100));
    }

}

