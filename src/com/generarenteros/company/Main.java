package com.generarenteros.company;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

/*4.  Elabora un programa que convierta un x número de galones en litros, ten en cuenta que hay 3.7854 litros en un galón*/
public class Main {

    public static final double litro = 3.7854;

    public static void main(String[] args) {

        double dameLitro;
        double galonConvertir;
        double total;
        double migalon;

        dameLitro = Double.parseDouble(JOptionPane.showInputDialog("Dame el litro a convertir a galon"));
//7.5708
        if (dameLitro > 0) {
            total = dameLitro * litro;
            JOptionPane.showMessageDialog(null, "Valor " + total);
            System.out.printf("%.2f", total);

        } else {
            galonConvertir = Double.parseDouble(JOptionPane.showInputDialog("Dame el galon a convertir a litro"));
            System.out.println(calcularLitroaGalon(galonConvertir));

        }
    }
//7.56
//3.78
//11.34
//15.12
//18.9
//22.68

    public static double calcularLitroaGalon(double galon) {
        int gl = 0;
        int i = 0;
        int contador = 0;

        for (i = 0; i < 10; i++) {
            if (galon / i == 3.78) {
                System.out.println("Valor : " + i);
                gl = i;
            } else {
            }
        }

        return gl;
    }
}