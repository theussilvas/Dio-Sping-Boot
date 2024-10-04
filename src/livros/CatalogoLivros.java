package livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo,autor,anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for( Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
		List<Livro> livroPorIntervaloAno = new ArrayList<Livro>();
		
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloAno.add(l);
				}
			}
		}
		return livroPorIntervaloAno;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	public static void main(String[]args) {
		
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Livro 1","Autor 1", 2021);
		catalogo.adicionarLivro("Livro 1","Autor 1", 2020);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		
		System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
		System.out.println(catalogo.pesquisarPorIntervaloAno(2020, 2022));
		System.out.println(catalogo.pesquisaPorTitulo("Livro 1"));



	}
}
