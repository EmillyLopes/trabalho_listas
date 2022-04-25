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
	
	
	public void  verificaEscolha(ListaRN listaAlunos, int escolha, int op) {
			switch (escolha) {
			
			case 0:  {
				op = 0;
				
				System.out.println("Saindo...");
				System.exit(op);
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
				DisciplinasVO[] disciplina = adquirirDisciplina(pergunta);
				
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
	

	public DisciplinasVO[] adquirirDisciplina(int pergunta){
		Scanner teclado = new Scanner(System.in);
		DisciplinasVO[] disciplina = new DisciplinasVO[pergunta];
		
				for(int i = 0; i < disciplina.length; i++) {
					DisciplinasVO d = new DisciplinasVO();
					System.out.println("Digite as disciplinas:");
					teclado.nextLine();
					String dis = teclado.nextLine();
					d.setDisciplina(dis);
					
					System.out.println("Digite a nota:");	
					float nota = teclado.nextFloat();
					d.setNota(nota);
					
					disciplina[i] = d;
				
				} 
				System.out.println("Saindo...");
				return disciplina;
			
	}


}
