package aplicacao_console.copy;


import fachada.Fachada;



public class Consultar {

	public Consultar(){
		Fachada.inicializar();
		try {
			System.out.println(Fachada.consultarClientePorParteNome("he") );
			System.out.print(Fachada.consultartotalDeClientes());
	
     		System.out.println(Fachada.consultarProdutoPorParteNome("Ja"));
     		System.out.println(Fachada.consultarItem("Cal"));

			System.out.println(Fachada.consultartotalDeProdutos1());
			System.out.println(Fachada.consultarFuncionarioNome("Helen"));
			System.out.println(Fachada.consultartotalDeFuncionarios());
			System.out.println(Fachada.consultarTotalItens());
			System.out.println(Fachada.consultarVendas("Vestido","17115","Ana"));
			
	
			 
		

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.finalizar();
		System.out.println("fim do programa");
	}



	//=================================================
	public static void main(String[] args) {
		new Consultar();
	}
}

