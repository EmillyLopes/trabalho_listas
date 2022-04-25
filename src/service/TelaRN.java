package service;

import java.util.Scanner;

import entity.AlunoVO;
import entity.DisciplinasVO;

public class TelaRN {
	Scanner teclado = new Scanner(System.in);
	AlunoVO aluno;
	ListaRN lista;
	
	int pergunta = 1;

	public int pegaEntradaTecladoInt() {
		int variavel = teclado.nextInt();
		return variavel;
	}
	
	
	public void  verificaEscolha(ListaRN listaAlunos, int escolha) {
		int online = 1;
		if(online==1){
			switch (escolha) {
			case 0:{
				online=0;
				break;
			}
			case 1: {
				listaAlunos.mostraAlunos();
				break;
			}
			case 2: {
				System.out.println("Digite o RGM do aluno a ser inserido:");

				int insercao = pegaEntradaTecladoInt();
				int rgmASerInserido = insercao;

				if (rgmASerInserido == -1) {
					System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");
				}

				System.out.println("Agora insira o Nome do Aluno:");
				teclado.nextLine();
				String nomeNewAluno = teclado.nextLine();

				System.out.println("Disciplinas:");
				
				System.out.println("Deseja inserir quantas disciplinas?");
				pergunta = teclado.nextInt();
				DisciplinasVO[] disciplina = inserirDisciplina(pergunta);
				listaAlunos.inserirAluno(rgmASerInserido, nomeNewAluno, disciplina);
				break;
			}
			case 3: {
				System.out.println("Qual posição a do aluno que voce quer excluir?");
				int resposta = teclado.nextInt();
				int excluir = resposta - 1;
				listaAlunos.excluirAluno(excluir);
				break;
			}
			case 4: {
				System.out.println("Digite o RGM do aluno do qual voce deseja ver os dados");
				int buscaResposta = teclado.nextInt();
				int buscaMatricula = buscaResposta;
				if (buscaMatricula == -1) {
					System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");
				}else {
					listaAlunos.buscaRGM(buscaMatricula);
				}break;
			}
			default: {
				System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");
				}
			}

		}
	}

	public DisciplinasVO inserirDisciplina(int pergunta){
		Scanner teclado = new Scanner(System.in);
		DisciplinasVO disciplina = new DisciplinasVO();
				for(int i = 0; i < pergunta; i++) {
					System.out.println("Digite as disciplinas:");
					teclado.nextLine();
					String dis = teclado.nextLine();
					disciplina.setDisciplina(dis);
					System.out.println("Digite a nota:");					
					float nota = teclado.nextFloat();
					disciplina.setNota(nota);
					aluno.setDadosDis(disciplina);
				} 
				System.out.println("Saindo...");
			return disciplina;
	}
	public DisciplinasVO[] verificaResposta(int pergunta){
		Scanner teclado = new Scanner(System.in);
		DisciplinasVO[] disciplina = new DisciplinasVO[pergunta];
				for(int i = 0; i < disciplina.length; i++) {
					System.out.println("Digite as disciplinas:");
					disciplina[i].setDisciplina(teclado.nextLine());
					System.out.println("Digite a nota:");					
					disciplina[i].setNota(teclado.nextFloat());
					aluno.setDisciplinas(disciplina);
				} 
				System.out.println("Saindo...");
			
			return disciplina;
	}
	


}
