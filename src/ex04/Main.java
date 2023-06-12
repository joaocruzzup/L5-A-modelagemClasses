package ex04;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Corolla", "Toyota", 2, 1.8);
        Carro carro2 = new Carro("Golf", "Volkswagen", 4, 1.6);
        Carro carro3 = new Carro("Civic", "Honda", 2, 1.5);

        carro1.imprimirInformacoes();
        carro1.ligarCarro();
        carro1.imprimirInformacoes();
    }
}
