import java.util.Scanner;
import java.util.Random;

public class Janken {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int pedra = 1; int papel = 2; int tesoura = 3;
        int escolha;
        String jogarNovamente;

    do {

        do {
            System.out.println("Pedra, Papel ou Tesoura?");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Pedra.");
                    break;
                case 2:
                    System.out.println("Você escolheu Papel.");
                    break;
                case 3:
                    System.out.println("Você escolheu Tesoura.");
                    break;
                default:
                    System.out.println("Escolha inválida, tente novamente.");
                    break;
            }

            Thread.sleep(500);

        } while (escolha < 1 || escolha > 3);

        int escolhaComputador = gerador.nextInt(3) + 1;

        switch (escolhaComputador) {
            case 1:
                System.out.println("O computador escolheu Pedra.");
                break;
            case 2:
                System.out.println("O computador escolheu Papel.");
                break;
            case 3:
                System.out.println("O computador escolheu Tesoura.");
                break;
        }

        if (escolha == escolhaComputador) {
            System.out.println("Empate.");
        } else if ((escolha == pedra && escolhaComputador == tesoura) ||
                  (escolha == papel && escolhaComputador == pedra) ||
                  (escolha == tesoura && escolhaComputador == papel)) {
            System.out.println("Você venceu.");
        } else {
            System.out.println("Você perdeu.");
        }

        System.out.println("Deseja repetir? (s/n)");
        jogarNovamente = input.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Fim de jogo.");
        input.close();

    }
}