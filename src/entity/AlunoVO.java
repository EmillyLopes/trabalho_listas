package entity;

import java.util.List;

import service.ListaRN;

public class AlunoVO{
	
	AlunoVO aluno;
	private int rgm; // CHAVE PRIMARIA
	private String nome;
	public DisciplinasVO[] disciplinas;
	
	ListaRN lista;
	
	int tamanho = 0;
		
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDados (int matricula, String novoNome, DisciplinasVO[] disciplinas) {
		rgm = matricula;
		nome = novoNome;
		this.setDisciplinas(disciplinas);
		
	}
	public void setDadosDis (DisciplinasVO disciplinas) {
		DisciplinasVO d = new DisciplinasVO();
		this.disciplinas[tamanho] = d;
		tamanho++;
		
	}
	public DisciplinasVO[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(DisciplinasVO[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	}
