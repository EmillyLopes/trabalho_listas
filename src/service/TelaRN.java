package service;

import java.util.Scanner;

import entity.DisciplinasVO;

public class TelaRN {
	Scanner teclado = new Scanner(System.in);

	public int pegaEntradaTecladoInt() {
		int variavel = teclado.nextInt();
		return variavel;
	}
	
	
	public void  verificaEscolha(ListaRN listaAlunos, int escolha, int online, DisciplinasVO disciplina) {
		
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
			
//			System.out.println("Digite as disciplinas:");
//			teclado.next();
//			String dis = teclado.nextLine();
			listaAlunos.inserirAluno(rgmASerInserido, nomeNewAluno);
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
