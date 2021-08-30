import java.util.*;

public class App {
    public static void main(String[] args){

        Elevador elevador = new Elevador();
        Scanner ent = new Scanner(System.in);

        int escolha=0;
		do {
			System.out.println("O que deseja fazer?");
			System.out.println("0 - Sair do programa");
			System.out.println("1 - Inicializar");
			System.out.println("2 - Entrar ");
			System.out.println("3 - Sair ");
			System.out.println("4 - Subir ");
			System.out.println("5 - Descer ");
            System.out.println("6 - Status atual do elevador");

			escolha= ent.nextInt();
			
			switch (escolha) {
			case 0:
				System.out.println("Fim do programa!");
				break;
			case 1:
				elevador.inicializa(6, 10); // O elevador suporte no máximo 6 pessoas e possui 10 andares
				break;
			case 2:
				elevador.entra();;
				break;
			case 3:
				elevador.sai();
				break;
			case 4:
				elevador.sobe();
				break;
			case 5:
				elevador.desce();
				break;
            case 6:
				System.out.println(elevador.toString());
				break;
			default:
				break;
			}
				
		}while(escolha!=0);
		
    }
}
