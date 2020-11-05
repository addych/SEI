package br.edu.ufersa.sei.model.VO;

public class TurmaVO {
	private String nomeTurma;
	private String codigoTurma;
	private String local;
	private String horario; 
	private DisciplinaVO disciplinas[];
	private AlunoVO alunos[];
	
	//getters and setters
	
	public String getNomeTurma() {
		return nomeTurma;
	}
	
	public void setNomeTurma(String nomeTurma) {
		if(nomeTurma == null || nomeTurma.equals("")) {
			System.out.println("Necessário informar Nome da Turma!");
		}else {
			this.nomeTurma = nomeTurma;
		}
	}
	
	public String getCodigoTurma() {
		return codigoTurma;
	}
	
	public void setCodigoTurma(String codigoTurma) {
		if(codigoTurma == null || codigoTurma.equals("")) {
			System.out.println("Necessário informar Código da Turma!");
		}else {
			if(codigoTurma.charAt(0) == 'T' && codigoTurma.length() == 5) { 
				this.codigoTurma = codigoTurma;
			}else {
				System.out.println("O Código deve começar com 'T' e conter 5 caracteres!");
			}
		}	
	}

	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		if(horario != null && !horario.equals("")) {
			this.horario = horario;
		} else {
			System.out.println("Horário Inválido!");
		}
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		if(local == null || local.equals("")) {
			System.out.println("Necessário informar Local!");
		}else {
			this.local = local;
		}	
	}
	
	public DisciplinaVO[] getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(DisciplinaVO[] disciplinas) {
		if(disciplinas != null) {
			this.disciplinas = disciplinas;
		}else {
			System.out.println("Necessário informar Disciplinas");
		}		
	}
	
	public AlunoVO[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(AlunoVO[] alunos) {
		if(alunos != null) {
			this.alunos = alunos;
		}else {
			System.out.println("Necessário informar Alunos");
		}		
	}
	
	//métodos
	
	public void cadastrarTurmas(TurmaVO turma) {
		// a ser implementado
	}
	
	public void editarTurmas(TurmaVO turma) {
		// a ser implementado
	}
	
	public void excluirTurmas(TurmaVO turma) {
		// a ser implementado
	}
	
	public void buscarTurmas(TurmaVO turma) {
		// a ser implementado
	}
}
