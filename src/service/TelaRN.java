package service;

import java.util.Scanner;

import entity.AlunoVO;

public class TelaRN {
	Scanner teclado = new Scanner(System.in);
	AlunoVO aluno;
	ListaRN lista;

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

				System.out.println("Digite as disciplinas:");
				String[] disciplina = verificaResposta();
				
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
	
	public String[] verificaResposta(){
		Scanner teclado = new Scanner(System.in);
		String[] disciplina = new String[6];
		
		System.out.println("Deseja inserir disciplina? (1-SIM/0-NÃO)");
		int pergunta = pegaEntradaTecladoInt();
		
		
			while(pergunta==1) {
				for(int i = 0; i < disciplina.length; i++) {
					System.out.println("Digite as disciplinas:");
					disciplina[i]  = teclado.nextLine();
					aluno.setDisciplinas(disciplina);
				}
			}
		 
		return disciplina;
	}
}
