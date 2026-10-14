package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            totalCobaias = totalCobaias + quantidade;

            if (tipo == 'C') {
                totalCoelhos += quantidade;
            } else if (tipo == 'R') {
                totalRatos += quantidade;
            } else if (tipo == 'S') {
                totalSapos += quantidade;
            }
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf(Locale.US, "Percentual de coelhos: %.2f %%%n", (totalCoelhos * 100.0) / totalCobaias);
        System.out.printf(Locale.US, "Percentual de ratos: %.2f %%%n", (totalRatos * 100.0) / totalCobaias);
        System.out.printf(Locale.US, "Percentual de sapos: %.2f %%%n", (totalSapos * 100.0) / totalCobaias);

        scanner.close();
    }
}
