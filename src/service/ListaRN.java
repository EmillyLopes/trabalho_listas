package service;

import entity.AlunoVO;
import entity.DisciplinasVO;

public class ListaRN {

		AlunoVO [] universitarios = new AlunoVO[60];
		int tamanho = 0;
		
		
		public boolean estaVazia() {
			return (tamanho == 0);
		}
		
		public boolean estaCheia() {
			return (tamanho == universitarios.length);
		}
		
		public void mostraAlunos() {
			
			if (estaVazia()) {
				System.out.println("Nao ha nomes na lista");
			}else{
				System.out.println("Segue a lista de alunos:");
				for (int i = 0; i < tamanho; i++) {
					System.out.println("RGM:\t" + universitarios[i].getRgm());
					System.out.println("Nome:\t" + universitarios[i].getNome() + "\n");
				}
			}
		}
//		public int listarOrdemRgm(AlunoVO aluno, int rgm) {
//			if(this.rgm > aluno.getRgm()){
//				return -1;
//			}else if(this.this < carro.cilindrada){
//				return 1;
//			}
//			return this.getCor().compareToIgnoreCase(carro.getCor());
//		}}


		
		public void inserirAluno(int rgm, String alunoNome, DisciplinasVO[] disciplina) {
			if (estaCheia()) {
				System.out.println("A lista esta cheia");
			}else{
				AlunoVO a = new AlunoVO();
				a.setDados(rgm, alunoNome, disciplina);
				this.universitarios[tamanho] = a;
				tamanho++;
				System.out.println("Feito!\n\n");
			}
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
	 				return;
	 			}
	 		}
	 		System.out.println("Aluno n�o existe\n");
	 	}
		
		
		private void moveParaDireita(int posicao) {
			for( int i=tamanho+1 ;i>posicao; i--){
				universitarios[i] = universitarios[i - 1]; //quando o programa executa essa linha, sobrescreve duas vezes os ultimos dados que foram inseridos, ao inves de abrir uma nova posição para poder aloca-los
			}
		}

		private void moveParaEsquerda(int posicao){
			for( int i = posicao ;i<tamanho; i++){
				universitarios[i] = universitarios[i + 1];
			}
		}
		
	}

