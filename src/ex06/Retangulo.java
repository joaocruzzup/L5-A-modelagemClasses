package ex06;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarLados(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public List<Double> retornarLados(){
        List<Double> listaLados = new ArrayList<>();
        listaLados.add(this.base);
        listaLados.add(this.altura);
        return listaLados;
    }

    public double calcularArea(){
        return this.altura * this.base;
    }

    public double calcularPerimetro(){
        return (this.altura * 2) + (this.base * 2);
    }
}
