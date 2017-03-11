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
        } else {
//            galonConvertir = Double.parseDouble(JOptionPane.showInputDialog("Dame el galon a convertir a litro"));
            calcularLitroaGalon();

        }
    }

    public static void calcularLitroaGalon() {
//7.5708
// 3.7854
//11.3562
        int contador = 0;
        double valore = (double) (3.7854 * 3);
        System.out.println("MY VALOR " +valore);
        for (int i = 1; i < 10; i++) {
            if (11.3562 / i == 3.7853999999999997) {
                System.out.println("---SI---");
                contador++;
            } else {
                System.out.println("---NO---");
            }
        }


    }
}