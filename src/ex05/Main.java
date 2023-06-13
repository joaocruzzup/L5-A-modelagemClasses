package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boas vindas a calculadora de área de um quadrado");

        System.out.println("Digite o tamanho do lado do quadrado em cm: ");
        double tamanhoLado = sc.nextDouble();
        Quadrado q1 = new Quadrado(tamanhoLado);

        System.out.println("O tamanho do lado escolhido é: " + q1.retornarTamanhoLado());
        double area = q1.calcularArea();
        System.out.println("A área do quadrado é: " + area + "cm");

        System.out.println("Deseja mudar o tamanho do lado? (S/N)");
        String resposta = sc.next();
        while (!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
            System.out.println("Digite 'S' ou 'N': ");
            resposta = sc.next();
        }
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Digite o novo lado: ");
            q1.mudarTamanhoLado(sc.nextDouble());
            System.out.println("O novo tamanho do lado é: " + q1.retornarTamanhoLado());
            System.out.println("A nova área é: " + q1.calcularArea());
        } else {
            System.out.println("Tudo bem! Programa finalizado!");
            System.exit(0);
        }
    }
}
