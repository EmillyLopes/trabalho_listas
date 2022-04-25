package Service;
import entity.Disciplina;

public class ListaDisciplina 
{
	Disciplina primeiro = null;
	Disciplina ultimo = null;
	int tamanho = 0;
	
	public boolean estaVazia()
	{
		if(tamanho == 0)
				return true;
		
		return false;
	}
	public int tamanhoDaLista()
	{
		return (tamanho);
	}
	public void inserirDisciplinaInicio(Disciplina d) 
	{
		if(estaVazia())
			primeiro = ultimo = d;
		else {
			d.proxima = primeiro;
			primeiro = d;
		}
		tamanho ++;
	}
	public void inserirDisciplinaFim(Disciplina d)
	{
		if(estaVazia())
			primeiro = ultimo = d;
		else
		{
			ultimo.proxima = d;
			ultimo = d;
		}
		tamanho ++;
	}
	public void exibirLista()
	{
		Disciplina temp = primeiro;
		if(!estaVazia())
		{
			for(int i = 0; i < tamanho; i++)
			{
				System.out.println("Disciplina "+i+"nome: "+temp.nome + "nota: "+ temp.nota);
				temp = temp.proxima;
			}
		}
	}
	public void removerDisciplinaporNome(String nomeprocurado)
	{
		if(tamanho == 0)
		{
			System.out.println("A Lista está vazia!");
		}
		if (tamanho == 1) 
		{
			if (primeiro.nome.equals(nomeprocurado)) 
			{
					primeiro = ultimo = null;
					tamanho--;
					return;
			}
			else {
				System.out.println("O nome "+nomeprocurado+" não está na lista.");
				return;
			}
		}
		Disciplina disciplinadafrente = primeiro;
		Disciplina disciplinadetras = null;
		
		for (int i = 0; i < tamanho; i++) {
			if (nomeprocurado.equals(disciplinadafrente.nome)) {
				if (i == 0) {
					System.out.println("O primeiro da lista é o procurado e será removido.");
					primeiro = primeiro.proxima;
					tamanho--;
					return;
				}
				else {
					disciplinadetras.proxima = disciplinadafrente.proxima;
					tamanho--;
					return;
				}
			}
			else {
				disciplinadetras = disciplinadafrente;
				disciplinadafrente = disciplinadafrente.proxima;
			}
		}
		
		System.out.println("Disciplina "+nomeprocurado+" não está na lista");
		return;
	}
}
