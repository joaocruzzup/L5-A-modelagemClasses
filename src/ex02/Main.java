package ex02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 23, 1.83);
        Pessoa pessoa2 = new Pessoa("Victor", 22, 1.82, 80.00);

        System.out.println("Imprimindo informações da pessoa 1: ");
        pessoa1.exibirPessoa();

        System.out.println();

        System.out.println("Imprimindo informações da pessoa 2: ");
        pessoa2.exibirPessoa();

    }
}
