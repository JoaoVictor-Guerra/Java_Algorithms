
public class Carro{

    private String placaCarro;
    private int numeroPortas;
    private boolean novo;
    private boolean statusMotor;
  
    // Getter e setters da placa
  
    public String getPlacaCarro(){
      return this.placaCarro;
    }
  
    void setPlacaCarro(String placaCarro){
      this.placaCarro = placaCarro;
    }
  
    // Getter e setters do número de portas
  
    public int getNumeroPortas(){
      return this.numeroPortas;
    }
  
    void setNumeroPortas(int numeroPortas){
      this.numeroPortas = numeroPortas;
    }
  
    // Getter e setter para se dizer se o carro é novo
  
    public boolean getNovo(){
      return this.novo;
    }
  
    void setNovo(boolean novo){
      this.novo = novo;
      
    }
  
    // Métodos Gerais
  
    String carroNovo(){
        String resposta;
      if(novo == true ){
        resposta = "Este é um carro novo!";
      } else {
        resposta = "Este carro não é novo!";
      }
      return resposta;
    }

    void ligarMotor(){
        System.out.println("Motor ligado! Pronto para partir!");
        statusMotor = true;
    }

    void desligarMotor(){
        System.out.println("Motor desligado! Carro imóvel!");
        statusMotor = false;
    }
  
  }