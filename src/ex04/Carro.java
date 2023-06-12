package ex04;

public class Carro {
    String modelo;
    String marca;
    int qtdPortas;
    double potencia;
    String situacaoCarro = "Desligado";

    public Carro(String modelo, String marca, int qtdPortas, double potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.qtdPortas = qtdPortas;
        this.potencia = potencia;
    }

    public Carro(String modelo, String marca, int qtdPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.qtdPortas = qtdPortas;
        this.potencia = 2.0;
    }

    public String ligarCarro(){
        if (this.situacaoCarro.equalsIgnoreCase("desligado")){
            System.out.println("Ligando o carro... \nLigado!");
            this.situacaoCarro = "Ligado";
        } else {
            System.out.println("O carro já está ligado!");
        }
        return this.situacaoCarro;
    }

    public void imprimirInformacoes(){
        System.out.println(
                "Modelo: " + this.modelo +
                " | Marca: " + this.marca +
                " | Quantidade de portas: " + this.qtdPortas +
                " | Potência: " + this.potencia +
                " | Situação do carro: " + situacaoCarro);
    }
}
