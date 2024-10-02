package iphone;



public class Usuario {
	public static void main(String[]args) {
		
		Iphone ip = new Iphone();
		
		//Navegador
		String url = "www.google.com";
		System.out.println("Navegador");

		
		ip.adicionarNovaAba();
		ip.atualizarPagina();
		ip.exibirPagina(url);
		
		//Aparelho telefônico
		String numero = "40028922";
		System.out.println("Aparelho telefônico");

		ip.ligar(numero);
		ip.atender();
		ip.iniciarCorreioVoz();
		
		//Reprodutor musical
		String musica = "Please don't stop the music - Rihanna";
		System.out.println("Reprodutor musical");
		
		ip.selecionarMusica(musica);
		ip.tocar();
		ip.pausar();
		
		
		
	}
}
