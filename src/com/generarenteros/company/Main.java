package com.generarenteros.company;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

/*4.  Elabora un programa que convierta un x número de galones en litros, ten en cuenta que hay 3.7854 litros en un galón*/
public class Main {

    public static final double litro = 3.7854;

    public static void main(String[] args) {

        double dameLitro;
        double total;

        dameLitro = Double.parseDouble(JOptionPane.showInputDialog("Dame el litro a convertir"));

        if (dameLitro > 0) {
            total = dameLitro * litro;
            JOptionPane.showMessageDialog(null, "Valor " + total);
        }
    }

    public static double calcularLitroaGalon(double litro) {
        int litroa = 0;
        if (litro > 0) {
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
        }
        return litroa;
    }
}
