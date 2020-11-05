package br.edu.ufersa.sei.model.VO;

public class UsuarioVO {
	private String login;
	private String senha;
	
	//getters and setters
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		if(login == null || login.equals("")) {
			System.out.println("Login Inválido!");
		}else {
			if(login.length() >= 8) {
				this.login = login;
			}else {
				System.out.println("Login deve ter no mínimo 8 caracteres!");
			}
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if(senha == null || senha.equals("")) {
			System.out.println("Senha Inválida!");
		}else {
			if(senha.length() >= 8) {
				this.senha = senha;
			}else {
				System.out.println("Senha deve ter no mínimo 8 caracteres!");
			}
		}		
	}	
}
