package entities;

public class VerificaSenhaForte {

	private boolean tamanhoSenha;
	private boolean digito;
	private boolean minusculo;
	private boolean maiusculo;
	private boolean caracterEspecial;

	public VerificaSenhaForte(boolean tamanhoSenha, boolean digito, boolean minusculo, boolean maiusculo,
			boolean caracterEspecial) {
		this.tamanhoSenha = tamanhoSenha;
		this.digito = digito;
		this.minusculo = minusculo;
		this.maiusculo = maiusculo;
		this.caracterEspecial = caracterEspecial;
	}
	
	public boolean validaSenhaForte () {
		if (isTamanhoSenha() && isDigito() && isMinusculo() && isMaiusculo() && isCaracterEspecial()) {
			System.out.println("[ OK ] Password é forte.");
			return true;
		} else {
			System.out.println("[Fail] Password não é forte. É necessário inserir um password forte.");
		}
		return false;
	}

	public boolean isTamanhoSenha() {
		return tamanhoSenha;
	}

	public boolean isDigito() {
		return digito;
	}

	public boolean isMinusculo() {
		return minusculo;
	}

	public boolean isMaiusculo() {
		return maiusculo;
	}

	public boolean isCaracterEspecial() {
		return caracterEspecial;
	}
}
