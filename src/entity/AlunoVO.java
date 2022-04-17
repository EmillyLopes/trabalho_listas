package entity;

import java.util.List;

import service.ListaRN;

public class AlunoVO extends DisciplinasVO{
	
	AlunoVO aluno;
	private int rgm; // CHAVE PRIMARIA
	private String nome;
	String[] disciplinas = new String[20];
	ListaRN lista;
	
	int tamanho = 0;
		
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDados (int matricula, String novoNome, String disciplina) {
		rgm = matricula;
		nome = novoNome;
		this.inserirDisciplinas(disciplina);
		
	}
	public void inserirDisciplinas(String disciplina){
		for(int i = 0; i < tamanho; i++){
			disciplinas[i] = disciplina;
			tamanho++;
		}
	}
}