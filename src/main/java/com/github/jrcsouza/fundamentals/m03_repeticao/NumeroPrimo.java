package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        do {
            int x = scanner.nextInt();
            boolean ehPrimo = true;
            int divisor = 2;

            while (divisor < x) {
                if (x % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
                divisor++;
            }

            if (ehPrimo) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }

            n--;

        } while (n > 0);

        scanner.close();
    }
}
