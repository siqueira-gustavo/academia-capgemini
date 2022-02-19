package entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VerificaAnagramasTest {

//	 Montagem
	VerificaAnagramas string01; // instancia da classe VerificaAnagramas
	VerificaAnagramas string02;
	String palavra01;
	String palavra02;
	
	@Before
	public void setUp() throws Exception {
//		 Montagem
//		 Método de montagem para cada teste que será executado antes de cada teste
		palavra01 = "ovo";
		palavra02 = "ifailuhkqq";
		
//		 Instancia da classe VerificaAnagramas
		string01 = new VerificaAnagramas(palavra01);
		string02 = new VerificaAnagramas(palavra02);
	}

	@Test
	public void testGetCount() {
// 		 Execução
//		 Resultado do método getCount() da classe VerificaAnagramas
		int resultado01 = string01.getCount();
		int resultado02 = string02.getCount();
		
//		 Verificação:
// 		 Verifica se o contador esperado é igual ao contador obtido (resultado)
		assertEquals("Contagem esperada de anagramas", 2, resultado01);
		assertEquals("Contagem esperada de anagramas", 3, resultado02);
	}

	@Test
	public void testComparaPalavras() {
// 		 Execução
//		 Executa o método ComparaPalavras() da classe VerificaAnagramas com palavras que são anagramas
		boolean resultado01 = string01.ComparaPalavras("amor", "roma");
		boolean resultado02 = string02.ComparaPalavras("barco", "cobra");
		
//		 Executa o método ComparaPalavras() da classe VerificaAnagramas com palavras que não são anagramas
		boolean resultado03 = string02.ComparaPalavras("mal", "sal");

//		 Verificação:
// 		 Verifica se o resultado esperado é VERDADEIRO (as palavras são anagramas)
		assertTrue(resultado01);
		assertTrue(resultado02);
		
// 		 Verifica se o resultado esperado é FALSO (as palavras NÃO são anagramas)
		assertFalse(resultado03);
	}
	
	@Test
	public void testGetPalavra() {
// 		 Execução
//		 Resultado do método getPalavra() da classe VerificaAnagramas
		String resultado01 = string01.getPalavra(); 
		String resultado02 = string02.getPalavra();
		
//		 Verificação
//		 Verifica se a palavra inserida esperada é igual à palavra obtida
		assertEquals("Palavra inserida", palavra01, resultado01);
		assertEquals("Palavra inserida", palavra02, resultado02);
	}
}
