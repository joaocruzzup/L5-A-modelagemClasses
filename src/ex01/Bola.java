// Crie uma classe que modele uma bola, toda bola contém uma as entidades circunferência,
// cor, marca, material e velocidade e os métodos: trocaCor e mostraCor. Após a modelagem,
// instanciar objetos diferentes no método main para testes.

package ex01;

public class Bola {
    String marca ;
    String material;
    String cor;
    double circunferencia;
    double velocidade;

    public Bola(String marca, String material, String cor, double circunferencia, double velocidade) {
        this.marca = marca;
        this.material = material;
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
    }

    public void trocaCor(String cor){
        this.cor = cor;
    }

    public void mostraCor(){
        System.out.println("A cor da bola é: " + this.cor);
    }

    public void exibirInformacoes(int contador){
        System.out.printf(" ---- Informações da bola %d ----%n", contador);
        System.out.printf("|  Marca: %15s     |%n", this.marca);
        System.out.printf("|  Material: %13s    |%n", this.material);
        System.out.printf("|  Cor: %18s    |%n", this.cor);
        System.out.printf("|  Circunferência: %6.1fcm   |%n", this.circunferencia);
        System.out.printf("|  Velocidade: %10.1fkm/h |%n", this.velocidade);
        System.out.println(" -----------------------------");
    }
}
