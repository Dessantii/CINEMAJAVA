import java.util.Scanner;

public class Cinema {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int qtdFilas = 12;
		int qtdCadeiras = 14;
		boolean assento[][] = new boolean[qtdFilas][qtdCadeiras];
		
		int coluna = 0;
		int fila = 0;
		
		String continuar = null;

		while (true) {

			System.out.println("-------------------------------------------");
			System.out.println(" ESCOLHA O ASSENTO DESEJADO! ");
			System.out.println("-------------------------------------------");

			System.out.println();

			System.out.println(" Digite a fila desejado 0 - " + (qtdFilas - 1) + ": ");
			fila = teclado.nextInt();

			System.out.println(" Digite a cadeira desejado 0 - " + (qtdCadeiras - 1) + ": ");
			coluna = teclado.nextInt();

			assento[fila][coluna] = true;

			imprimirCadeiras(assento);
			
			System.out.println("Deseja continuar S - N");
			teclado.nextLine();
			continuar = teclado.nextLine();
			
			if (continuar.equalsIgnoreCase("N")) {
				System.out.println("-------------*************-----------------");
				System.out.println(" TENHA UM BOM FILME ");
				System.out.println("-------------*************-----------------");
				
				break;
			}
		}
	}

	static void imprimirCadeiras(boolean assentos[][]) {
		System.out.println("------------------------------------------\n");

		for (int i = 0; i < assentos.length; i++) {
			for (int j = 0; j < assentos[i].length; j++) {
				if (assentos[i][j] == true) {
					System.out.print("[X]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println("");
		}

		System.out.println("\n------------------------------------------");
	}
}