package br.edu.ufersa.sei.model.VO;

public class ProfessorVO {
	private String nomeProf;
	private String cpfProf;
	private String endProf;
	
	//getters and setters
	
	public String getNomeProf() {
		return nomeProf;
	}
	
	public void setNomeProf(String nomeProf) {
		if(nomeProf != null && !nomeProf.equals("")) {
			this.nomeProf = nomeProf;
		} else {
			System.out.println("Necessário informar Nome!");
		}
	}
	
	public String getCpfProf() {
		return cpfProf;
	}
	
	public void setCpfProf(String cpfProf) {
		if(cpfProf != null && !cpfProf.equals("")) {
			if(cpfProf.length() == 11) {
				this.cpfProf = cpfProf;
			}else {
				System.out.println("CPF Inválido!");
			}
		}else {
			System.out.println("Necessário informar CPF!");
		}
	}
	
	public String getEndProf() {
		return endProf;
	}
	
	public void setEndprof(String endProf) {
		if(endProf != null && !endProf.equals("")) {
			this.endProf = endProf;
		} else {
			System.out.println("Necessário informar Endereço!");
		}	
	}
	
	//métodos
	
	public void exibirPerfil(ProfessorVO prof) {
		// a ser implementado
	}
	
	public void lancarNotas() {
		// a ser implementado
	}
	
	public void cadastrarProf(ProfessorVO prof) {
		// a ser implementado
	}
	
	public void editarProf(ProfessorVO prof) {
		// a ser implementado
	}
	
	public void excluirProf(ProfessorVO prof) {
		// a ser implementado
	}
	
	public void buscarProf(ProfessorVO prof) {
		// a ser implementado
	}
}
