public class ContaCorrente {
    float juros = 0.01f;
    float saldo;
    float limiteChequeEspecial = -200f;
    String nomeCliente = "Alberto";
    String sobrenomeCliente = "Martins";
    long numeroConta = 123456789L;
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 0;
        conta.saque();

        conta.deposito(100);
        conta.rendimento();
        conta.consultaSaldo();

    }
    public void deposito(float valor) {
        saldo += valor;
    }
    public void saque() {
        if (saldo > 0 & limiteChequeEspecial > 0) {
            saldo -= 125;
            System.out.println("Saque liberado");
        }
        else
            System.out.println("Limite insuficiente!");
    }
    public void rendimento() {
        if (saldo > 0)
            saldo = saldo + saldo * juros;
    }
    public void consultaSaldo() {
        System.out.println("Seu saldo é " + saldo);
    }
    public String getNome() {
        return nomeCliente + " " + sobrenomeCliente;
    }
    public long getNumero() {
        return numeroConta;
    }
}
