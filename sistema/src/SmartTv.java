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

        String resultado = volume >= 100 ? "Máximo!" : Integer.toString(volume++);
        System.out.println("Volume " + resultado);

        // if(volume >= 100)
        //     System.out.println("Volume Máximo!");
        // else{
        //     volume++;
        //     System.out.println("Volume " + volume);
        // }
    }

    public void diminuirVolume(){

        String resultado = volume <= 0 ? "Mínimo!" : Integer.toString(volume--);
        System.out.println("Volume " + resultado);

        // if(volume <= 0)
        //     System.out.println("Volume Mínimo!");
        // else{
        //     volume--;
        //     System.out.println("Volume " + volume);
        // }
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

    public void buscarCanal(){

        for(int canal = 0; canal <= 100; canal++){
            System.out.println("Buscando... Canal existentes: " + canal);
        }
    }
}
