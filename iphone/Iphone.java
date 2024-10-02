package iphone;

public class Iphone implements Navegador,ReprodutorMusica,ApareloTelefonico {

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para o número " + numero );
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica selecionada " + musica +  "tocando");
		
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página " + url );
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Página atualizada");
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Nova aba criada");
		
	}

}
