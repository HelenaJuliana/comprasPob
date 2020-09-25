package aplicacao_console.copy;

import fachada.Fachada;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Produto;
import modelo.Venda;

public class Cadastrar {

	public Cadastrar() {
		try {
			Fachada.inicializar();
			Cliente cl = null;
			Produto pro;
			Funcionario fun = null;
			Venda v;

			System.out.println("cadastrando...");

			cl= Fachada.cadastrarCliente(" Claudio", "410102", "ruaendereco", "pl@gmail",
			 "12312231");

			 System.out.println(cl);

//			
//			v = Fachada.CadastrarVendas("123450", "17115", "Ana Clara", "funcio@", 
//					"Andre", "8989", "Rua perdida", "9999",
//					"cliente@", "16/08/2020", 20.0);
//			System.out.println(v);
//			

//			pro= Fachada.cadastrarProdutos("202", "Vestido 2 ",20.00, 11, "Preto e branco  etc");
//			System.out.println(pro);
			
			fun= Fachada.cadastrarFuncionario("17101145","Maria 4",
			 "mariavendas@gmail.com");
			 System.out.println(fun);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			Fachada.finalizar();
		}

		System.out.println("\nfim do programa");
	}

	// =================================================
	public static void main(String[] args) {
		new Cadastrar();
	}
}