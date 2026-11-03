package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel;

        do {
            tipoCombustivel = scanner.nextInt();

            if (tipoCombustivel == 1) {
                alcool++;
            } else if (tipoCombustivel == 2) {
                gasolina++;
            } else if (tipoCombustivel == 3) {
                diesel++;
            }

        } while (tipoCombustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
