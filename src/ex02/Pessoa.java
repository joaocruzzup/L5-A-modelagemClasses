// Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura. No construtor,
// o peso é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.

package ex02;

public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;


    // Construtor que possibilita em que o peso é opcional
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0;
    }

    // Construtor que possibilita em que o peso é obrigatório
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void exibirPessoa(){
        System.out.printf(
                "Nome: %s %n" +
                "Idade: %d anos%n" +
                "Altura: %.2f m %n", this.nome, this.idade, this.altura);
        if (peso == 0){
            System.out.println("Peso: Não informado");
        } else if (peso < 0){
            System.out.println("Peso: Valor inválido");
        } else {
            System.out.printf("Peso: %.2f Kg", peso);
        }
    }
}
