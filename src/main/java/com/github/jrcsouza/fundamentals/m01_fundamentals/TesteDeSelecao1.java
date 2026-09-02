package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean isBMaiorQueC = b > c;
        boolean isDMaiorQueA = d > a;
        boolean isSomaCDMaiorQueSomaAB = (c + d) > (a + b);
        boolean isCDPositivos = (c > 0) && (d > 0);
        boolean isAForPar = (a % 2 == 0);

        if (isBMaiorQueC && isDMaiorQueA && isSomaCDMaiorQueSomaAB && isCDPositivos && isAForPar) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores nao aceitos");
        }
        scanner.close();
    }
}

/*public class TesteDeSelecao1 { //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2 == 0)) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores nao aceitos");
        }
        scanner.close();
    }
}
*/
