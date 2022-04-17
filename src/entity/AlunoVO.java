package entity;

import java.util.List;

import service.ListaRN;

public class AlunoVO extends DisciplinasVO{
	
	AlunoVO aluno;
	private int rgm; // CHAVE PRIMARIA
	private String nome;
	DisciplinasVO[] disciplinas = new DisciplinasVO[20];
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
	public void setDados (int matricula, String novoNome) {
		rgm = matricula;
		nome = novoNome;
		
	}
	
	
	
}
