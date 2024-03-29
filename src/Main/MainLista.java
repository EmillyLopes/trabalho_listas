package Main;

import java.util.Scanner;

import entity.AlunoVO;
import entity.DisciplinasVO;
import service.ListaRN;
import service.TelaRN;

public class MainLista {
	public static void main(String[] args) {				

		Scanner teclado = new Scanner(System.in);
		ListaRN listaAlunos = new ListaRN();
		AlunoVO aluno;
		int op = 1;
	
		while(op ==1) {
		mostraOpcoes();
		int escolha = teclado.nextInt();
		TelaRN  tela = new TelaRN();
		tela.verificaEscolha(listaAlunos, escolha);
		}
			
		System.out.println("Encerrando...");
		teclado.close();
	}

	public static void mostraOpcoes() {
		System.out.println("O que voce quer fazer?\n"
				+ "1 - Listar Alunos\n"
				+ "2 - Inserir um Aluno na lista\n"
				+ "3 - Excluir um Aluno da lista\n"
				+ "4 - Buscar por um Aluno na lista\n"
				+ "0 - Sair");
	}
}


	


