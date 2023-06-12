package ex03;

public class ContaCorrente {
    String nomeCorrentista;
    int numeroConta;
    double saldo;

    public ContaCorrente(String nomeCorrentista, int numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaCorrente(String nomeCorrentista, int numeroConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = (saldo < 0)? 0: saldo;
    }

    public void depositoConta(double valor){
        if (valor <= 0) {
            System.out.println("Erro: Valor do depósito é inválido (valor menor ou igual 0)");
        } else {
            this.saldo += valor;
        }
    }

    public void saqueConta(double valor){
        if (valor > this.saldo){
            System.out.println("Erro: Saldo insuficiente para o saque requerido");
        } else {
            this.saldo -= valor;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nomeCorrentista + "| Conta: " + numeroConta + "| Saldo: " + saldo);
    }

}
