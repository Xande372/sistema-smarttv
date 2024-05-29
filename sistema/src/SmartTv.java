public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 99;

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

        if(volume >= 100)
            System.out.println("Volume Máximo!");
        else{
            volume++;
            System.out.println("Volume " + volume);
        }
    }

    public void diminuirVolume(){

        if(volume <= 0)
            System.out.println("Volume Mínimo!");
        else{
            volume--;
            System.out.println("Volume " + volume);
        }
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
