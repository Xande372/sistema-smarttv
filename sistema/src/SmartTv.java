public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){

        ligada = true;
        System.out.println("Ligando a Tv...");
        System.out.println("Sintonizada no Canal " + canal);
    }

    public void desligarTv(){

        ligada = false;
        System.out.println("Desligando...");
    }

    public void aumentarVolume(){

        volume++;
        System.out.println("Volume " + volume);
    }

    public void diminuirVolume(){

        volume--;
        System.out.println("Volume " + volume);
    }

    public void mudarCanal(int mudarCanal){

        canal = mudarCanal;
        System.out.println("Sintonizada no canal " + canal);
    }

    public void próximoCanal(){

        canal++;
        System.out.println("Canal atual = " + canal);
    }

    public void anteriorCanal(){

        canal--;
        System.out.println("Canal atual = " + canal);
    }
}
