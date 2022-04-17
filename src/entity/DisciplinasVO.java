package entity;

import service.ListaRN;

public class DisciplinasVO {

	AlunoVO aluno;
	ListaRN listaAluno;
	DisciplinasVO[] disciplinas;
	
	public DisciplinasVO[] getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(DisciplinasVO[] disciplina) {
		this.disciplinas = disciplina;
	}
	private void setDiciplinas(AlunoVO alunos, DisciplinasVO[] disciplina) {
		aluno = alunos;
		disciplinas = disciplina;
	}

}
