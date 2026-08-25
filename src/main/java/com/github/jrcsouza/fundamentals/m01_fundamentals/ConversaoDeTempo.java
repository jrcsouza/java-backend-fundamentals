package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int hora = tempo / 3600;
        tempo = tempo % 3600;
        int minutos = tempo / 60;
        int segundos = tempo % 60;

        System.out.println(hora + ":" + minutos + ":" + segundos);
        scanner.close();
    }
}
