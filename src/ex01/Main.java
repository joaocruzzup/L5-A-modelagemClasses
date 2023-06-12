package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola("Nike", "Couro", "Verde", 68, 50);
        Bola bola2 = new Bola("Adidas", "Sintético", "Vermelho", 60, 40);
        Bola bola3 = new Bola("Penalty", "Borracha", "Azul", 63, 44);
        Bola bola4 = new Bola("Puma", "Couro", "Preto", 70, 47);
        Bola bola5 = new Bola("Umbro", "Borracha", "Amarelo", 64, 38);

        List<Bola> lista_bolas = new ArrayList<>(Arrays.asList(bola1, bola2, bola3, bola4, bola5));

        System.out.println("\n---- Imprimindo cores atuais das bolas ----");

        // Imprimindo as cores das bolas, utilizando mostraCor() e um laço de repetição
        int i = 0;
        for (Bola bola:lista_bolas) {
            System.out.printf("Cor da bola %d: ", i);
            bola.mostraCor();
            i++;
        }

        // Trocando as cores com o método trocaCor
        bola1.trocaCor("Azul");
        bola2.trocaCor("Amarelo");
        bola3.trocaCor("Marrom");
        bola4.trocaCor("Branco");
        bola5.trocaCor("Preto");

        System.out.println("\n---- Imprimindo novas cores das bolas ----");

        // Imprimindo as novas cores das bolas, utilizando mostraCor() e um laço de repetição
        int j = 0;
        for (Bola bola:lista_bolas) {
            System.out.printf("Cor da bola %d: ", j);
            bola.mostraCor();
            j++;
        }

        // Imprimindo as informações das bolas utilizando o método criado exibirInformações()
        int z = 1;
        for (Bola bola: lista_bolas){
            bola.exibirInformacoes(z);
            z++;
        }
    }
}
