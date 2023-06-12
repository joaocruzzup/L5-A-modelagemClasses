package ex03;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("João", 1235, 5000.00);
        ContaCorrente conta2 = new ContaCorrente("Victor", 12536);
        ContaCorrente conta3 = new ContaCorrente("Victor", 12537, -1);

        conta1.depositoConta(500);
        conta1.depositoConta(-1);
        conta1.saqueConta(60000);
        conta1.saqueConta(500);

        conta2.depositoConta(500);
        conta2.depositoConta(-1);
        conta2.saqueConta(6000);
        conta2.saqueConta(500);

        conta3.depositoConta(500);
        conta3.depositoConta(-1);
        conta3.saqueConta(6000);
        conta3.saqueConta(500);

        System.out.println("Informações contas: ");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        conta3.exibirInformacoes();

    }
}
