package App;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class AppSenha {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Desafio Capgemini]: # Questão 02 - Verificador de senha.");
		System.out.println("Critérios para uma senha segura - Sua senha deve ter no mínimo:\n"
				+ "[ 6 caracteres | 1 digito | 1 letra minúscula | 1 letra maiúscula | 1 caractere especial ]");
		System.out.print("Insira a sua senha: ");
		String senha = sc.nextLine();
		VerificaTamanhoSenha tamanhoSenha = new VerificaTamanhoSenha(senha);
		VerificaDigito digito = new VerificaDigito(senha);
		VerificaMinusculo minusculo = new VerificaMinusculo(senha);
		VerificaMaiusculo maiusculo = new VerificaMaiusculo(senha);
		VerificaCaracterEspecial caracterEspecial = new VerificaCaracterEspecial(senha);
		
		boolean tamanhoSenhaForte = tamanhoSenha.validaSenha();
		boolean digitoForte = digito.validaSenha();
		boolean minusculoForte = minusculo.validaSenha();
		boolean maiusculoForte = maiusculo.validaSenha();
		boolean caracterEspecialForte = caracterEspecial.validaSenha();
		
		VerificaSenhaForte senhaForte = new VerificaSenhaForte(tamanhoSenhaForte, digitoForte, minusculoForte, maiusculoForte, caracterEspecialForte);
		
		senhaForte.validaSenhaForte();
		
		sc.close();
	}
}
