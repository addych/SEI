package br.edu.ufersa.sei.model.VO;

public class DiretorVO {
	private String nomeDiretor;
	private String cpfDiretor;
	private String endDiretor;
	
	//getters and setters
	
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	
	public void setNomeDiretor(String nomeDiretor) {
		if(nomeDiretor != null && !nomeDiretor.equals("")) {
			this.nomeDiretor = nomeDiretor;
		} else {
			System.out.println("Necessário informar Nome!");
		}
	}
	
	public String getCpfDiretor() {
		return cpfDiretor;
	}
	
	public void setCpfDiretor(String cpfDiretor) {
		if(cpfDiretor != null && !cpfDiretor.equals("")) {
			if(cpfDiretor.length() == 11) {
				this.cpfDiretor = cpfDiretor;
			}else {
				System.out.println("CPF Inválido!");
			}
		}else {
			System.out.println("Necessário informar CPF!");
		}
	}
	
	public String getEndDiretor() {
		return endDiretor;
	}
	
	public void setEndDiretor(String endDiretor) {
		if(endDiretor != null && !endDiretor.equals("")) {
			this.endDiretor = endDiretor;
		} else {
			System.out.println("Necessário informar Endereço!");
		}
	}
	
	//métodos
	
	public void exibirPerfil(DiretorVO diretor) {
		// a ser implementado
	}
}
