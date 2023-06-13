package ex05;

public class Quadrado {
    double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarTamanhoLado(double valor){
        if (valor <= 0){
            System.out.println("Erro: Valor inválido!");
        } else {
            this.tamanhoLado = valor;
        }
    }

    public double retornarTamanhoLado(){
        return this.tamanhoLado;
    }

    public double calcularArea(){
        return tamanhoLado * tamanhoLado;
    }
}
