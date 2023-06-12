package ex02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 18, 183);
        Pessoa pessoa2 = new Pessoa("Victor", 22, 182, 80.00);


        System.out.println("[ANTES] Imprimindo informações da pessoa 1");
        pessoa1.exibirPessoa();

        pessoa1.envelhecer(3);
        pessoa1.engordar(3);
        pessoa1.emagrecer(2);
        pessoa1.crescer(0);

        System.out.println("\n[DEPOIS] Imprimindo informações da pessoa 1");
        pessoa1.exibirPessoa();

        System.out.println("------------------------------------------");
        System.out.println("[ANTES] Imprimindo informações da pessoa 2");
        pessoa2.exibirPessoa();

        pessoa2.envelhecer(3);
        pessoa2.engordar(3);
        pessoa2.emagrecer(2);
        pessoa2.crescer(30);

        System.out.println("\n[DEPOIS] Imprimindo informações da pessoa 2");
        pessoa2.exibirPessoa();









    }
}
