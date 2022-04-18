package entity;

import java.util.List;

import service.ListaRN;

public class AlunoVO{
	
	AlunoVO aluno;
	private int rgm; // CHAVE PRIMARIA
	private String nome;
	String[] disciplinas;
	ListaRN lista;
	
	int tamanho = 0;
		
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String[] getDisciplinas() {
		for(int i = 0; i < tamanho; i++){
			System.out.println(disciplinas[i]);
			tamanho++;
		}
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
	public void setDados (int matricula, String novoNome, String[] disciplinas) {
		rgm = matricula;
		nome = novoNome;
		this.setDisciplinas(disciplinas);
		
	}
	public void inserirDisciplinas(String disciplina){
		for(int i = 0; i < tamanho; i++){
			disciplinas[i] = disciplina;
			tamanho++;
			
		}
	}
}