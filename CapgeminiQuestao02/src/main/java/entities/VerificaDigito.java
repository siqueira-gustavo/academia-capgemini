package entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaDigito {
	
	private String senha;
	
	public VerificaDigito(String senha) {
		this.senha = senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}

	public boolean validaSenha() {
		String criterio = "digito";
		String regex = "[0-9]";
		
		if (getSenha() != "") {
			String fraseAcesso = "[ OK ] Password contém no mínimo 1 "
					+ criterio + ".";
			String fraseErro = "[Fail] Password não contém nenhum "
					+ criterio + ". "
					+ "É necessário inserir ao menos 1 "
					+ criterio
					+ " para que a senha seja segura.";

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(getSenha());

			if (matcher.find()) {
				System.out.println(fraseAcesso);
				return true;
			} else {
				System.out.println(fraseErro);
				return false;
			}
		} else {
			System.out.println(
					"[Fail] Password não contém nenhum caracter. É necessário inserir o password corretamente.");
		}
		return false;
	}
}
