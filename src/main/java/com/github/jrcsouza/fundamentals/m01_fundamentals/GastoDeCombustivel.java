package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        int distanciaPecorrida = tempoGasto * velocidadeMedia;
        double quantidadeLitros = distanciaPecorrida / 12.0;

        System.out.printf(Locale.US, "%.3f%n", quantidadeLitros);
        scanner.close();
    }
}
