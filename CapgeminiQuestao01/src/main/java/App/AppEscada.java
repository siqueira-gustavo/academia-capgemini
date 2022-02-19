package App;

import java.util.Locale;
import java.util.Scanner;

public class AppEscada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int space;
		
		System.out.println("[Desafio Capgemini]: # Questão 01 - Desenhar uma escada com base e altura iguais.");
		System.out.print("Digite a quantidade de degraus da escada: ");
		int n = sc.nextInt();
		
		for (y = 1; y <= n; y++) {
	        for (space = n; space > y; space--) {
	            System.out.print(' ');
	        }
	        for (x = 1; x <= y; x++) {
	            System.out.print('*');
	        }
	        System.out.println();
	    }
		sc.close();
	}
}
