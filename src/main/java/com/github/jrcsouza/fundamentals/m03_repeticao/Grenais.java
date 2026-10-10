package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vitoriaGremio = 0;
        int vitoriaInter = 0;
        int contadorGrenais = 0;
        int contadorEmpate = 0;
        int novoGrenal = 1;

        while (novoGrenal == 1) {
            contadorGrenais = contadorGrenais + 1;
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                vitoriaInter = vitoriaInter + 1;
            } else if (golsInter < golsGremio) {
                vitoriaGremio = vitoriaGremio + 1;
            } else {
                contadorEmpate = contadorEmpate + 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = scanner.nextInt();
        }

        System.out.println(contadorGrenais + " grenais");
        System.out.println("Inter:"+ vitoriaInter);
        System.out.println("Gremio:"+ vitoriaGremio);
        System.out.println("Empates:"+ contadorEmpate);

        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriaInter < vitoriaGremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        scanner.close();
    }
}
