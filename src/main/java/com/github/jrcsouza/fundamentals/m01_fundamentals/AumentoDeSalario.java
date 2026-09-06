package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double salario = scanner.nextDouble();

        double novoSalario = 0, reajuste = 0;
        int percentual = 0;

        if (salario > 0 && salario <= 400.00) {
            reajuste = salario * 0.15;
            percentual = 15;
            novoSalario = salario + reajuste;
        } else if (salario >= 400.01 && salario <= 800.00) {
            reajuste = salario * 0.12;
            percentual = 12;
            novoSalario = salario + reajuste;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            reajuste = salario * 0.10;
            percentual = 10;
            novoSalario = salario + reajuste;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            reajuste = salario * 0.07;
            percentual = 7;
            novoSalario = salario + reajuste;
        } else {
            reajuste = salario * 0.04;
            percentual = 4;
            novoSalario = salario + reajuste;
        }
        System.out.printf(Locale.US, "Novo salario: %.2f%n", novoSalario);
        System.out.printf(Locale.US, "Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");
        scanner.close();
    }
}




