import java.util.Scanner;

public class Covid19 {

    public static final double PERCENTUAL_MORTALIDADE = 0.02;

    public static void Pandemia() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há quantos dias começou a pandemia: ");
        int dias = scanner.nextInt();

        System.out.print("Qual o número de casos no momento: ");
        int casos = scanner.nextInt();

        double mostesAtuais = (casos * PERCENTUAL_MORTALIDADE);
        System.out.println("Nº atual de mortes " + mostesAtuais);

        double mediaDiaria = casos / dias;

        double trintaDias = casos + (mediaDiaria * 30);
        System.out.println("Nº previsto de casos para daqui 30 dias " + trintaDias);

        double noventaDias = casos + (mediaDiaria * 90);
        System.out.println("Nº previsto de casos para daqui 90 dias " + noventaDias);

        double mortesNoventaDias = (noventaDias * PERCENTUAL_MORTALIDADE);

        System.out.println("Nº de mortes para daqui 90 dias " + mortesNoventaDias);
    }
}
