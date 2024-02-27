import java.util.Scanner;

public class Cliente {
    private String nome;
    private Conta conta;
    private Banco banco;

    public Cliente(String nome, Conta conta, Banco banco) {
        this.nome = nome;
        this.conta = conta;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public static Cliente cadastrarCliente(Banco banco) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        Conta conta = new Conta(numeroConta, 0);
        banco.adicionarCliente(new Cliente(nome, conta, banco));

        return new Cliente(nome, conta, banco);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = cadastrarCliente(banco);
        System.out.println("Cliente cadastrado:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Número da conta: " + cliente.getConta().getId());
    }
}
