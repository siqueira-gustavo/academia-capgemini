package entities;

public class VerificaTamanhoSenha {

	private String senha;
	
	public VerificaTamanhoSenha(String senha) {
		this.senha = senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}

	public boolean validaSenha() {
		int count = 0;
		String fraseAcesso = "[ OK ] Password contém no mínimo 6 caracteres.";
		if (getSenha().length() >= 6) {
			System.out.println(fraseAcesso);
			return true;
		} else {
			count = 6 - getSenha().length();
			System.out.printf("[Fail] Password contém apenas %d caracteres. "
					+ "É necessário inserir mais %d caracteres para que a senha seja segura.\n", getSenha().length(), count);
		}
		return false;
	}
}
