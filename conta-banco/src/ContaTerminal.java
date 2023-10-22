import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // todo: Conhecer e umportar classe Scanner
        Scanner input = new Scanner(System.in);
        double saldo;
        int numconta, agencia;
        String nomecliente;

        // Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Olá, Seja bem vind!");
        System.out.println("Por favor, insira seu nome");
        nomecliente = input.nextLine();

        System.out.println("Otimo, agora digite o número da agencia");
        agencia = input.nextInt();

        System.out.println("Bom, digite o numero da sua conta!");
        numconta = input.nextInt();

        System.out.println("digite o valor de seu saldo!");
        saldo = input.nextDouble();

        // Exibir as mensagens
        System.out.println("Olá " + nomecliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numconta + " e seu saldo " + saldo + " já está disponível para saque.");

        input.close();

    }
}
