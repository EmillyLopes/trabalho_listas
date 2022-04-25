package entity;

public class Disciplina {
	public String nome;
	public int	nota;
	public Disciplina proxima;
	
	public int getNota() {
		return nota;
	}
	
	public Disciplina getProximo() {
		return proxima;
	}
	public void setProximo(Disciplina proxima) {
		this.proxima = proxima;
	}
	public void setNome(String string, String nome) 
	{
		this.nome = nome;
		
	}
	public void setNota(int nota)
	{
		this.nota = nota;
	}

	
}

