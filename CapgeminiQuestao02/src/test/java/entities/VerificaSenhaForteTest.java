package entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerificaSenhaForteTest {

//	Montagem
	String palavra01 = "Yae&ab";
	String palavra02 = "Ya3&a";
	String palavra03 = "YA3&AB";
	String palavra04 = "ya3&ab";
	String palavra05 = "Ya3Sab";
	String palavra06 = "Ya3&ab";
	String palavra07 = "";

	VerificaTamanhoSenha palavraTamanhoInsuficiente = new VerificaTamanhoSenha(palavra07);
	VerificaDigito palavraSemDigito = new VerificaDigito(palavra07);
	VerificaMinusculo palavraSemMinusculo = new VerificaMinusculo(palavra07);
	VerificaMaiusculo palavraSemMaiusculo = new VerificaMaiusculo(palavra07);
	VerificaCaracterEspecial palavraSemEspecial = new VerificaCaracterEspecial(palavra07);

	boolean tamanho = palavraTamanhoInsuficiente.validaSenha();
	boolean digito = palavraSemDigito.validaSenha();
	boolean minusculo = palavraSemMinusculo.validaSenha();
	boolean maiusculo = palavraSemMaiusculo.validaSenha();
	boolean especial = palavraSemEspecial.validaSenha();

	VerificaSenhaForte palavraSenhaForte = new VerificaSenhaForte(tamanho, digito, minusculo, maiusculo, especial);
	boolean senhaForte = palavraSenhaForte.validaSenhaForte();

	@Test
	public void testVerificaSenhaForteEmBranco() {
//		Verifições
		assertFalse(digito);
		assertFalse(tamanho);
		assertFalse(minusculo);
		assertFalse(maiusculo);
		assertFalse(especial);
		assertFalse(senhaForte);
	}

	@Test
	public void testVerificaSenhaForteFalhou() {
//		Montagem com as strings que não atendem aos requisitos para passar.
		palavraSemDigito.setSenha(palavra01);
		palavraTamanhoInsuficiente.setSenha(palavra02);
		palavraSemMinusculo.setSenha(palavra03);
		palavraSemMaiusculo.setSenha(palavra04);
		palavraSemEspecial.setSenha(palavra05);
		
//		Execução
		digito = palavraSemDigito.validaSenha();
		tamanho = palavraTamanhoInsuficiente.validaSenha();
		minusculo = palavraSemMinusculo.validaSenha();
		maiusculo = palavraSemMaiusculo.validaSenha();
		especial = palavraSemEspecial.validaSenha();

//		Verifições
		assertFalse(digito);
		assertFalse(tamanho);
		assertFalse(minusculo);
		assertFalse(maiusculo);
		assertFalse(especial);
	}

	@Test
	public void testVerificaSenhaFortePassou() {
//		Montagem com a string que "Ya3&ab" que atende aos requisitos para passar.
		palavraSemDigito.setSenha(palavra06);
		palavraTamanhoInsuficiente.setSenha(palavra06);
		palavraSemMinusculo.setSenha(palavra06);
		palavraSemMaiusculo.setSenha(palavra06);
		palavraSemEspecial.setSenha(palavra06);

//		Execução
		digito = palavraSemDigito.validaSenha();
		tamanho = palavraTamanhoInsuficiente.validaSenha();
		minusculo = palavraSemMinusculo.validaSenha();
		maiusculo = palavraSemMaiusculo.validaSenha();
		especial = palavraSemEspecial.validaSenha();

		palavraSenhaForte = new VerificaSenhaForte(tamanho, digito, minusculo, maiusculo, especial);
		senhaForte = palavraSenhaForte.validaSenhaForte();

//		Verifições
		assertTrue(digito);
		assertTrue(tamanho);
		assertTrue(minusculo);
		assertTrue(maiusculo);
		assertTrue(especial);
		assertTrue(senhaForte);
	}

}
