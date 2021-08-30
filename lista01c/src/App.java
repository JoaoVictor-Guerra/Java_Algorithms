import java.util.Scanner;

// Existem 20 canais;
// O canal 0 é considerado;
// O volume máximo é 40.

public class App {
    public static void main(String[] args) {

        Televisao televisao = new Televisao();
        Scanner ent = new Scanner(System.in);

        int escolha=0;
		do {
			System.out.println("O que deseja fazer?");
			System.out.println("0 - Sair do programa");
            System.out.println("1 - Ligar televisão");
			System.out.println("2 - Próximo canal");
			System.out.println("3 - Canal anterior ");
			System.out.println("4 - Aumentar volume ");
			System.out.println("5 - Diminuir volume ");
			System.out.println("6 - Mudar canal (escolher canal) ");
            System.out.println("7 - Consultar status atuais");
            System.out.println("8 - Desligar televisão");

			escolha= ent.nextInt();
			
			switch (escolha) {
            case 0:
				System.out.println("Fim do programa!");
				break;
			case 1:
				televisao.ligar();
				break;
			case 2:
				televisao.maisCanal();
				break;
			case 3:
				televisao.menosCanal();;
				break;
			case 4:
				televisao.maisVolume();
				break;
			case 5:
				televisao.menosVolume();
				break;
			case 6:
                System.out.println("Escolha um canal");
                int numCanal = ent.nextInt();
				televisao.mudarCanal(numCanal);
                
				break;
            case 7:
				televisao.consultar();
				break;
            case 8:
				televisao.desligar();
				break;
			default:
				break;
			}
				
		}while(escolha!=0);
		
    }

    }
