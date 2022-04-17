package Main;

import java.util.Scanner;

import entity.DisciplinasVO;
import service.ListaRN;
import service.TelaRN;

public class MainLista {
	public static void main(String[] args) {				

		int online = 1;
		Scanner teclado = new Scanner(System.in);
		ListaRN listaAlunos = new ListaRN();
		DisciplinasVO disciplina = new DisciplinasVO();

		while(online==1){
			
			mostraOpcoes();
			int escolha = teclado.nextInt();
			TelaRN  tela = new TelaRN();
			tela.verificaEscolha(listaAlunos, escolha, online, disciplina);

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


	


