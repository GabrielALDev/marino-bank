import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        String agencia = "067-8";
        double saldo = 237.48;
        String nome;
        int numero = 0;
        
        System.out.print("Qual o seu nome? ");
        nome = teclado.nextLine();


        System.out.print("Qual o número da conta? ");
        numero = teclado.nextInt();

        if (numero == 1021) {
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco,\nsua agência é " + agencia + ", conta " + numero + " e seu saldo R$:" + saldo + "\nJá está disponível para saque.");
        } else{
            System.out.println("Falha, conta invalida");
        }
    }
}
