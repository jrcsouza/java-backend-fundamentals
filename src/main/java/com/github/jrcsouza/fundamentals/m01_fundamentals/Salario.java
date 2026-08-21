package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf(Locale.US, "SALARY = U$ %.2f\n", salario);

        scanner.close();


    }
}
