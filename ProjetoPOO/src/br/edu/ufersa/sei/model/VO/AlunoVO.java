package br.edu.ufersa.sei.model.VO;

public class AlunoVO {
	private String nome;
	private String endereco;
	private String matricula;
	private TurmaVO turma;
	private double n1;
	private double n2;
	private double n3;
	private double media;
	private int frequencia;
	
	//getters and setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.equals("")) {
			this.nome = nome;
		} else {
			System.out.println("Necessário informar Nome!");
		}			
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		if(endereco != null && !endereco.equals("")) {
			this.endereco = endereco;
		} else {
			System.out.println("Necessário informar Endereço!");
		}		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		if(matricula != null && !matricula.equals("")) {
			if(matricula.length() == 10) {
				this.matricula = matricula;
			}else {
				System.out.println("Matrícula deve conter 10 dígitos!");
			}
		}else {
			System.out.println("Necessário informar Matrícula!");
		}	
	}
	
	public TurmaVO getTurma() {
		return turma;
	}
	
	public void setTurma(TurmaVO turma) {
		if(turma != null) {
			this.turma = turma;
		}else {
			System.out.println("Necessário informar Turma!");
		}
	}
		
	public double getN1() {
		return n1;
	}
	
	public void setN1(double n1) {
		if(n1 >= 0 && n1 <= 10) {
			this.n1 = n1;
		}else {
			System.out.println("Nota Inválida!");
		}
	}
	
	public double getN2() {
		return n2;
	}
	
	public void setN2(double n2) {
		if(n2 >= 0 && n2 <= 10) {
			this.n2 = n2;
		}else {
			System.out.println("Nota Inválida!");
		}
	}
	
	public double getN3() {
		return n3;
	}
	
	public void setN3(double n3) {
		if(n3 >= 0 && n3 <= 10) {
			this.n3 = n3;
		}else {
			System.out.println("Nota Inválida!");
		}
	}
	
	public double getMedia() {
		return media;
	}
	
	//método para calcular média
	public double calcular(double n1, double n2, double n3) {
		this.media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	public int getFrequencia() {
		return frequencia;
	}
	
	public void setFrequencia(int frequencia) {
		if(frequencia>=0) {
			this.frequencia = frequencia;
		}else {
			System.out.println("Frequência Inválida!");
		}
	}

	//métodos
	
	public void exibirPerfil(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void exibirDisc(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void exibirNotasFreq(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void cadastrarAluno(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void editarAluno(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void excluirAluno(AlunoVO aluno) {
		// a ser implementado
	}
	
	public void buscarAluno(AlunoVO aluno) {
		// a ser implementado
	}	
}
