import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Game game = new Game(20, 20);
	Ranking rank = new Ranking(game);
	boolean salir = false;
	int option = 0;
	Scanner sc = new Scanner(System.in);
			
	do {
		System.out.println("Tria una d'aquestes opcions");
		System.out.println("1 - Jugar");
		System.out.println("2 - Ranking");
		System.out.println("3 - Sortir");

		
		option = sc.nextInt();
		
		switch(option) {
		case(1): {
			game.start();
			rank.Write(game);
			break;
		}
		case(2): {
			rank.Read();
			game = new Game(20, 20);
			break;
		}
		case(3): {
			salir = true;
			break;
		}
		default:
			System.out.println("Nombre incorrecte");
		
	}

}while (!salir);
	}
}
