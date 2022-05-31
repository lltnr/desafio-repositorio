package org.example;

public class CalcImposto {
    public static float aliquota;

    public static float calcImposto(float valor) {
        return valor * aliquota / 100;
    }

}
