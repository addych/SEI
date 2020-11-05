package br.edu.ufersa.sei.model.VO;

public class AtividadeVO {
	private String dataEntrega;
	private String descricaoAtv;
	private DisciplinaVO disciplina;
	
	//getters and setters
	
	public String getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(String dataEntrega) {
		if(dataEntrega != null && !dataEntrega.equals("")) {
			this.dataEntrega = dataEntrega;
		} else {
			System.out.println("Data Inválida!");
		}
	}
	
	public String getDescricaoAtv() {
		return descricaoAtv;
	}
	
	public void setDescricaoAtv(String descricaoAtv) {
		if(descricaoAtv == null || descricaoAtv.equals("")) {
			System.out.println("Necessário informar Descrição da Atividade!");
		}else {
			this.descricaoAtv = descricaoAtv;
		}	
	}
	
	public DisciplinaVO getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(DisciplinaVO disciplina) {
		if(disciplina != null) {
			this.disciplina = disciplina;
		}else {
			System.out.println("Necessário informar Disciplina!");
		}
	}

	//métodos
	
	public void cadastrarAtv(AtividadeVO atv) {
		// a ser implementado
	}
	
	public void editarAtv(AtividadeVO atv) {
		// a ser implementado
	}
	
	public void excluirAtv(AtividadeVO atv) {
		// a ser implementado
	}
	
	public void exibirAtv(AtividadeVO atv) {
		// a ser implementado
	}
}
