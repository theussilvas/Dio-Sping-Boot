package pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{

	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade,altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasIdade);;
		return pessoasIdade;
	}
	
	public List<Pessoa> ordernarAltura(){
		List<Pessoa> pessoasAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasAltura, new CompararPorAltura());
		
		return pessoasAltura;
	}
	
	public static void main(String[]args) {
		OrdenacaoPessoa op = new OrdenacaoPessoa();
		
		op.adicionarPessoa("Nome 1", 20, 1.56);
		op.adicionarPessoa("Nome 2", 30, 1.80);
		op.adicionarPessoa("Nome 3", 25, 1.70);
		op.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordernarAltura());
	}
}
