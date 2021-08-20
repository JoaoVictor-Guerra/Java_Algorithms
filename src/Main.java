import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Carro opala = new Carro();

        System.out.println("//// Bem vindo ao programa! ////\n");

        opala.ligarMotor();

        // Entradas do usuário

        System.out.println("Qual é a placa do carro?");
        opala.setPlacaCarro(entrada.nextLine());

        System.out.println("Qual é o número de portas?");
        opala.setNumeroPortas(entrada.nextInt());

        System.out.println("O carro é novo [1/0]?");
        opala.setNovo(entrada.nextBoolean());

        // Fim entradas do usuário

        opala.desligarMotor();
    }
}


// CRTL SHIFT P