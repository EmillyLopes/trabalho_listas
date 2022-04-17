package service;

import java.util.Scanner;

import entity.AlunoVO;
import entity.DisciplinasVO;

public class TelaRN {
	Scanner teclado = new Scanner(System.in);
	AlunoVO aluno;

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
				String disciplina = teclado.nextLine();

				System.out.println("Deseja inserir mais? (1-SIM/0-NÃO)");				
				int pergunta = pegaEntradaTecladoInt();
				verificaResposta(pergunta);			
				
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
	public void verificaResposta(int pergunta){
		Scanner teclado = new Scanner(System.in);
		if(pergunta ==1){
			System.out.println("Digite as disciplinas:");
			String disciplina = teclado.nextLine();
			System.out.println("Deseja inserir mais? (1-SIM/0-NÃO)");
			pergunta = pegaEntradaTecladoInt();
		}else {
			System.out.println("Saindo...");
		}
	}		
}
