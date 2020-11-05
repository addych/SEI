package br.edu.ufersa.sei.model.VO;

public class DisciplinaVO {
	private String nomeDisc;
	private String codigoDisc;
	private ProfessorVO profDisc;
	private AtividadeVO atividades[];
	private boolean status; //ativa ou finalizada
	
	//getters and setters
	
	public String getnomeDisc() {
		return nomeDisc;
	}
	
	public void setnomeDisc(String nomeDisc) {
		if(nomeDisc != null && !nomeDisc.equals("")) {
			this.nomeDisc = nomeDisc;
		} else {
			System.out.println("Necessário informar o nome da Disciplina!");
		}	
	}
	
	public String getCodigoDisc() {
		return codigoDisc;
	}
	
	public void setCodigoDisc(String codigoDisc) {
		if(codigoDisc != null && !codigoDisc.equals("")) {
			if(codigoDisc.length() == 7) {
				this.codigoDisc = codigoDisc;
			}else {
				System.out.println("Códido da Disciplina Inválido!");
			}
		}else {
			System.out.println("Necessário informar Código da Disciplina!");
		}
	}
	
	public ProfessorVO getProfDisc() {
		return profDisc;
	}
	
	public void setProfDisc(ProfessorVO profDisc) {
		if(profDisc != null) {
			this.profDisc = profDisc;
		}else {
			System.out.println("Necessário informar Professor!");
		}
	}
	
	public AtividadeVO[] getAtividades() {
		return atividades;
	}
	
	public void setAtividades(AtividadeVO[] atividades) {
		if(atividades != null) {
			this.atividades = atividades;
		}else {
			System.out.println("Necessário informar Atividades");
		}	
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	//métodos
	
	public void cadastrarDisc(DisciplinaVO disc) {
		// a ser implementado
	}
	
	public void editarDisc(DisciplinaVO disc) {
		// a ser implementado
	}
	
	public void excluirDisc(DisciplinaVO disc) {
		// a ser implementado
	}
	
	public void finalizarDisc(DisciplinaVO disc) {
		// a ser implementado
	}
	
	public void buscarDisc(DisciplinaVO disc) {
		// a ser implementado
	}
	
	public void bsucarProf(ProfessorVO prof) {
		// a ser implementado
	}
}
