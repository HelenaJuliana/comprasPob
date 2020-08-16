package aplicacao_console.copy;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import fachada.Fachada;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Produto;


public class Deletar {

	public Deletar(){
		Fachada.inicializar();
		Cliente cl = null;
		Funcionario fun = null;
		Produto pro = null;
		
		try {
			System.out.println("deletando...");
			Fachada.excluirCliente("881220");
			//Fachada.excluirProduto("1234");
			
			//Fachada.excluirFuncionario("1234");
			
			System.out.println("");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Fachada.finalizar();
		System.out.println("fim do programa");
	}



	//=================================================
	public static void main(String[] args) {
		new Deletar();
	}
}

