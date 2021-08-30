public class Televisao {
    private boolean ligada;
    private int volume;
    private int canal;

    // Get-set canal

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    //Get-set volume

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Get-set ligada 

    public boolean getLigada(){
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    //////////////////////////// Métodos ///////////////////////////

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void maisCanal(){
        if(ligada == true){
            if(canal == 20){
                canal = 0;
            } else {
            canal++;
            }
        } else {
            System.out.println("Televisão desligada!");
        }

    }

    public void menosCanal(){
        if(ligada == true){
            if(canal == 0){
                canal = 20;
            } else {
            canal--;
            }
        } else {
            System.out.println("Televisão desligada!");
        }
    }

    public void maisVolume(){
        if(ligada == true){
            if(volume == 40){
                System.out.println("Você já está no volume máximo!");
            } else {
            volume++;
            }

        } else {
            System.out.println("Televisão desligada!");
        }
    }

    public void menosVolume(){
        if(ligada == true){
            if(volume == 0){
                System.out.println("Você já está no volume mínimo!");
            } else {
            volume--;
            }
        } else {
            System.out.println("Televisão desligada!");
        }
    }

    public void mudarCanal(int numCanal){
        if(ligada == true){
            if(numCanal > 20 || numCanal < 0){
                System.out.println("Esse canal não existe.");
            } else {
            canal = numCanal;
            }
        } else {
            System.out.println("Televisão desligada!");
        }
    }

    public void mudarCanal(){
        if(ligada == true){
            if(canal == 20){
                canal = 0;
            } else {
            canal++;
            }
        } else {
            System.out.println("Televisão desligada!");
        }

    }

    public void consultar(){
        System.out.println("O atual canal é " + canal);
        System.out.println("O volume atual é " + volume);
    }

}


