package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boas vindas a calculadora de área de um retângulo");

        System.out.println("Digite o tamanho da base do retângulo em cm: ");
        double base = sc.nextDouble();

        System.out.println("Digite o tamanho da altura do retângulo em cm: ");
        double altura = sc.nextDouble();

        Retangulo r1 = new Retangulo(base, altura);

        System.out.printf("O retângulo selecionado possui: %nBase: %.2f cm %nAltura: %.2f cm %n",
                r1.retornarLados().get(0), r1.retornarLados().get(1));
        System.out.println("Área: " + r1.calcularArea() + " cm");
        System.out.println("Perímetro: " + r1.calcularPerimetro() + " cm");

        System.out.println("Deseja mudar o tamanho dos lados? (S/N)");
        String resposta = sc.next();
        while (!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
            System.out.println("Digite 'S' ou 'N': ");
            resposta = sc.next();
        }
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Digite a nova base: ");
            base = sc.nextDouble();
            System.out.println("Digite a nova altura: ");
            altura = sc.nextDouble();
            r1.mudarLados(base, altura);
            System.out.printf("Valores atualizados: %nBase: %.2f cm %nAltura: %.2f cm %n",
                    r1.retornarLados().get(0), r1.retornarLados().get(1));
            System.out.println("Área é: " + r1.calcularArea());
            System.out.println("Perímetro: " + r1.calcularPerimetro());
        } else {
            System.out.println("Tudo bem! Programa finalizado!");
            System.exit(0);
        }
    }
}
