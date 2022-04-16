package entity;

public class AlunoVO {

	private int rgm; // CHAVE PRIMARIA
	private String nome;
	DisciplinasVO [] disciplinas = new DisciplinasVO[100];
		
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDados (int matricula, String novoNome, DisciplinasVO disciplinas) {
		rgm = matricula;
		nome = novoNome;
		disciplin = disciplinas;
		
	}
}
