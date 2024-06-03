import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        boolean exibirMenu = true;
        while (exibirMenu) {

            System.out.println("---------------------------------");
            System.out.println("Tv Smart de última geração!!!!!!!!!!");
            System.out.println("---------------------------------");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ligar tv");
            System.out.println("2 - Escolher canal");
            System.out.println("3 - Buscar canais");
            System.out.println("4 - Aumentar volume");
            System.out.println("5 - Diminuir volume");
            System.out.println("0 - Desligar tv");
            System.out.println("---------------------------------");

            try{
                switch (scanner.next()) {

                    case "1":
                        smartTv.ligarTv();
                        break;

                    case "2":
                        System.out.println("Escolha o canal desejado:");
                        smartTv.mudarCanal(scanner.nextInt());
                        break;
                    
                    case "3":
                        smartTv.buscarCanal();
                        break;

                    case "4":
                        smartTv.aumentarVolume();
                        break;

                    case "5":
                        smartTv.diminuirVolume();
                        break;

                    case "0":
                        smartTv.desligarTv();
                        exibirMenu = false;
                        break;

                    default:
                        System.out.println("Comando inválido!");
                        break;
                }
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Os caracteres terão que ser numéricos!");
            }
        }

        // // Estado inicial da tv:
        // System.out.println("Tv = " + smartTv.ligada);
        // System.out.println("Sintonizada no Canal " + smartTv.canal);
        // System.out.println("Volume " + smartTv.volume);
        // System.out.println("---------------------------------");


        // // Chamada do usuário:
        
        // System.out.println("Alexa, ligar tv.");
        // smartTv.ligarTv();

        // System.out.println("---------------------------------");
        // System.out.println("Alexa, aumentar volume em 1 duas vezes.");
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // // smartTv.aumentarVolume();

        // System.out.println("---------------------------------");
        // System.out.println("Alexa, diminuir volume em 1.");
        // smartTv.diminuirVolume();
        // smartTv.diminuirVolume();

        // System.out.println("---------------------------------");
        // System.out.println("Alexa, buscar canais.");
        // smartTv.buscarCanal();

        // System.out.println("---------------------------------");
        // System.out.println("Alexa, colocar no canal 45.");
        // smartTv.mudarCanal(45);
    }
}
