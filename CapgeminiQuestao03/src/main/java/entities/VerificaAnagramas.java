package entities;

import java.util.Arrays;

public class VerificaAnagramas {

	private String palavra;
	private int count;

	public VerificaAnagramas(String palavra) {
		this.setPalavra(palavra);
	}
	
	/**
	 * Método que verifica se o conjunto combinações formadas 1 é anagrama do conjunto de combinações formadas 2.
	 */
	public boolean ComparaPalavras(String conjunto1, String conjunto2) {

		char[] pos1 = conjunto1.toCharArray(); // transforma a string em um array de caracteres
		char[] pos2 = conjunto2.toCharArray(); // transforma a string em um array de caracteres

		Arrays.sort(pos1); // ordena o array de caracteres
		Arrays.sort(pos2); // ordena o array de caracteres

		for (int i = 0; i < pos1.length; i++) { // percorre o array de caracteres
			if (pos1[i] != pos2[i]) { // verifica se os caracteres são iguais
				return false; // se não forem iguais, retorna falso
			}
		}
		return true; // se forem iguais, retorna verdadeiro
	}

	/**
	 * Método que cria os conjuntos de combinações das letras, e se encontrar pares, adiciona ao contador.
	 * @param palavra
	 */
	 public int getCount() {
		palavra = getPalavra();
		
		for (int k = 1; k < palavra.length(); k++) { // k representa o tamanho da palavra
			for (int i = 0; i < palavra.length() - k; i++) { // i representa o índice da palavra (posição inicial)
				String conjunto1 = palavra.substring(i, i + k); // cria o conjunto de combinações (pega o substring de i até i+k)
				for (int j = i + 1; j <= palavra.length() - k; j++) { // j representa o índice da palavra (começa do i+1)
					String conjunto2 = palavra.substring(j, j + k); // cria o conjunto de combinações (pega o substring de j até j+k)
					if (ComparaPalavras(conjunto1, conjunto2)) { // verifica se os conjuntos são anagramas (compara os conjuntos e se forem anagramas, incrementa o contador)
						count++;
					}
				}
			}
		}
		return count;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
}
