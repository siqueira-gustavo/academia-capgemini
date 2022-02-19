package App;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class AppAnagramas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Desafio Capgemini]: # Questão 03 - Encontre anagramas.");
		System.out.print("Deseja verificar quantas strings? ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			System.out.print("Digite a string " + (i + 1) + ": ");
			String palavra = sc.nextLine();
			VerificaAnagramas contagemAnagramas = new VerificaAnagramas(palavra);
			int result = contagemAnagramas.getCount();

			System.out.println("Foram encontrado(s) " + result + " anagrama(s).");
		}
		sc.close();
	}
}