package service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import entity.AlunoVO;
import entity.DisciplinasVO;

public class ListaRN {

		AlunoVO aluno;
		TelaRN tela;
		AlunoVO[] universitarios = new AlunoVO[60];
		DisciplinasVO[] disciplinas;


		int tamanho = 0;
		
		
		public boolean estaVazia() {
			return (tamanho == 0);
		}
		
		
		public boolean estaCheia() {
			return (tamanho == universitarios.length);
		}
	
		public void mostraAlunos() {

			try {
				if (estaVazia() )
					
					System.out.println("Nao ha nomes na lista");
				else {
					System.out.println("Segue a lista de alunos:");
					for (int i = 0; i < universitarios.length; i++) {
						System.out.println("RGM:\t" + universitarios[i].getRgm());
						System.out.println("Nome:\t" + universitarios[i].getNome());
						System.out.println("Disciplinas:");
						for (int j = 0; j < universitarios[i].disciplinas.length; j++) {
							System.out.println("Nome: " + universitarios[i].disciplinas[j].getDisciplina() 
									+ "\tNota: \t" + universitarios[i].disciplinas[j].getNota());		
						}
						System.out.println("-------------------------------------\n");
					}
				}
			} catch (Exception e) {
				System.out.println("\nParando...");
			}

		}
//		public void MostrarAlunosOrdenado() {
//			for (int i = 0; i < universitarios.length; i++) {
//				for (int j = 0; i < universitarios.length; i++) {
//					Arrays.parallelSort(universitarios[i].getRgm());;
//				}
//			}
//
//		}
		
		public void inserirAluno(int rgm, String alunoNome, DisciplinasVO[] disciplinas) {
			
			if ( estaCheia()) {
				System.out.println("A lista esta cheia");
			
			}else{
				AlunoVO a = new AlunoVO();
				a.setDados(rgm, alunoNome, disciplinas);
				this.universitarios[tamanho] = a;
				tamanho++;
				System.out.println("Feito!\n\n");
			}
		}
		
		public DisciplinasVO[] inserirDisciplinas(int pergunta, DisciplinasVO disciplinas){
			DisciplinasVO[] disciplina = new DisciplinasVO[pergunta];
			for(int i = 0; i < tamanho; i++){
				disciplina[i] = disciplinas;
				tamanho++;
			}
			return disciplina;
		}
		
		public void excluirAluno(int posicao) {
			
			for(int i = posicao ;i<tamanho; i++) {
				this.universitarios[i]=this.universitarios[i+1];

			}

			tamanho--;
			System.out.println("aluno excluido!");

		}

	 	public void buscaRGM(int chave) {

	 		for(int i = 0; i < tamanho; i++) {
	 			if(universitarios[i].getRgm() == chave) {
	 				System.out.println("Nome:\t" + universitarios[i].getNome() + "\n");
					System.out.println("RGM:\t" + universitarios[i].getRgm());
	 				return;
	 			}
	 		}
	 		System.out.println("Aluno não existe\n");
	 	}	
}
