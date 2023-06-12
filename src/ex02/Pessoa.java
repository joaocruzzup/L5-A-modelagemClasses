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

    public void envelhecer(int anos) {
        if (this.idade < 21) {
            for (int i = this.idade; i < this.idade + anos; i++) {
                crescer(0.5);
            }
            ;
        }
        this.idade += anos;
    }

    public void engordar(double pesoGanho) {
        if (pesoGanho < 0) {
            System.out.println("PesoGanho inválido");
        } else if (this.peso == 0) {
            System.out.println("Atenção: O peso inicial é inválido, não é possível engordar");
        } else {
            this.peso += pesoGanho;
        }
    }

    public void emagrecer(double pesoPerdido) {
        if (pesoPerdido < 0) {
            System.out.println("PesoPerdido inválido");
        } else if (this.peso == 0) {
            System.out.println("Atenção: O peso inicial é inválido, não é possível emagrecer");
        } else {
            this.peso -= pesoPerdido;
        }
    }

    public void crescer(double alturaGanha) {
        if (alturaGanha < 0) {
            System.out.println("AlturaGanha inválida");
        } else {
            this.altura += alturaGanha;
        }
    }

    public void exibirPessoa() {
        System.out.printf(
                "Nome: %s %n" +
                        "Idade: %d anos%n" +
                        "Altura: %.2f cm %n", this.nome, this.idade, this.altura);
        if (peso == 0) {
            System.out.println("Peso: Não informado \n");
        } else if (peso < 0) {
            System.out.println("Peso: Valor inválido \n");
        } else {
            System.out.printf("Peso: %.2f Kg %n", peso);
        }
    }
}
