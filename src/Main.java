import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nome = "Carlos Serathiuk";
       Scanner leitura = new Scanner(System.in);
       String conta = "Corrente";
       int saldo = 0;

        System.out.println("""
                *******************
                Nome:       """+ nome);
        System.out.println("Tipo de conta:" + conta);
        System.out.println("Saldo atual: R$"+saldo);

        String menu = """
                ** Digite uma opção **
                1- Consultar Saldo
                2- Enviar Pix
                3- Receber Pix
                4- Sair
                **********************
                """;


        int opcao = 0;
        int valorSaldo = 0;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Seu Saldo é: R$" + saldo);
            }
            else if (opcao == 2) {
                 System.out.println("Digite o Valor que você deseja enviar: ");
                 double valor = leitura.nextDouble();
                 if (valor >= saldo) {
                     System.out.println("Não há saldo para realizar a transferência");
                 } else {
                     saldo -= valor;
                     System.out.println("Seu saldo atual é: R$" + saldo);
                 }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao == 4) {
                System.out.println("Você saiu");
                break;
            }
        }
    }
}
