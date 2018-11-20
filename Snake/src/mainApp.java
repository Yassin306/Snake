import java.util.Scanner;

public class mainApp {
	static Game game = new Game(20, 20);
	static Ranking rank = new Ranking(game);
	static boolean salir = false;
	static int option = 0;
	static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		do {
			System.out.println("Tria una d'aquestes opcions");
			System.out.println("1 - Jugar");
			System.out.println("2 - Ranking");
			System.out.println("3 - Sortir");
		
			sc = new Scanner(System.in);
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

	/**
	 * @param game the game to set
	 */
	public static void setGame(Game game) {
		mainApp.game = game;
	}
}
