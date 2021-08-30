import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /* Passando valores pelo construtor

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sexo(M/F):");
        String sexo = entrada.nextLine();
        System.out.println("Digite seu peso(Kg):");
        float peso = entrada.nextFloat();
        System.out.println("Digite sua altura(metros):");
        float altura = entrada.nextFloat();
        Pessoa pessoa = new Pessoa(nome, sexo, peso, altura);
        */

        // Passando valores por get-set

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome:");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Digite seu sexo(M/F):");
        pessoa.setSexo(entrada.nextLine());

        System.out.println("Digite seu peso(Kg):");
        pessoa.setPeso(entrada.nextFloat());

        System.out.println("Digite sua altura(metros):");
        pessoa.setAltura(entrada.nextFloat());

        pessoa.imprimeDados();
        pessoa.calculaIMC();

    }
}
