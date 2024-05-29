public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        // Estado inicial da tv:
        System.out.println("Tv = " + smartTv.ligada);
        System.out.println("Sintonizada no Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        System.out.println("---------------------------------");


        // Chamada do usuário:
        
        System.out.println("Alexa, ligar tv.");
        smartTv.ligarTv();

        System.out.println("---------------------------------");
        System.out.println("Alexa, aumentar volume em 1 duas vezes.");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        // smartTv.aumentarVolume();

        System.out.println("---------------------------------");
        System.out.println("Alexa, diminuir volume em 1.");
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("---------------------------------");
        System.out.println("Alexa, buscar canais.");
        smartTv.buscarCanal();

        System.out.println("---------------------------------");
        System.out.println("Alexa, colocar no canal 45.");
        smartTv.mudarCanal(45);
    }
}
