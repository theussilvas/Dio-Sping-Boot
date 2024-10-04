package dio;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefas> tarefalist;

	public ListaTarefa() {
		this.tarefalist = new ArrayList<>();
	}
	
	public void addTarefa(String descricao) {
		tarefalist.add(new Tarefas(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		for(Tarefas t : tarefalist) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefalist.removeAll(tarefasParaRemover);
	}
	
	public int obterTotalTarefas(){
		return tarefalist.size();
	}
	
	public void obterDescricao() {
		System.out.println(tarefalist);
	}
	
	public static void main(String[]args) {
		ListaTarefa listatarefa = new ListaTarefa();
		System.out.println(listatarefa.obterTotalTarefas());
		
		listatarefa.addTarefa("Tarefa 1");
		listatarefa.addTarefa("Tarefa 1");
		listatarefa.addTarefa("Tarefa 3");
		System.out.println(listatarefa.obterTotalTarefas());
		
		listatarefa.removerTarefa("Tarefa 1");
		System.out.println(listatarefa.obterTotalTarefas());
		
		listatarefa.obterDescricao();
	}
}


