
package fachada;

import java.util.List;

import dao.DAO;
import dao.DAOCliente;
import dao.DAOFuncionario;
import dao.DAOProduto;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Item;

public class Fachada {
	private static final String Clientes = null;
	private static DAOCliente daocliente = new DAOCliente();  
	private static DAOFuncionario daofuncionario = new DAOFuncionario();  
	private static DAOProduto daoproduto = new DAOProduto();  


	public static void inicializar(){
		DAO.open();
	}
	public static void finalizar(){
		DAO.close();
	}

	public static Cliente cadastrarCliente(String nome, String cpf,String endereco,
									String telefone, String email) throws  Exception{
		DAO.begin();	
		Object daocliente = null;
		Cliente cl = ((DAOCliente) daocliente).read(cpf);
		if(cl != null) {
			DAO.rollback();
			throw new Exception("cadastrar cliente - cliente ja cadastrado:" + nome);
		}

		Cliente cl1 = new Cliente("Maria", "1232646", "ruaendereco", "maria@gmail", "12312231");
		((DAO<Cliente>) daocliente).create(cl1);	
		DAO.commit();
		return cl1;
	}
	public static String consultarClienteNTelefones(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String consultarClientePorParteNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public static Funcionario cadastrarFuncionario(String nome, String cpf) 
			throws  Exception{
		DAO.begin();	
		Cliente cl = daocliente.read(nome);
		if(cl != null) {
			DAO.rollback();
			throw new Exception("cadastrar funcionario - pessoa ja cadastrado:" + nome);
		}

		
		cl = new Cliente("helena", "123", "rua tal", "helena@gmail.com","4561233");
		daocliente.create(cl);	
		DAO.commit();
		return (Funcionario(cl));
	}


private static Funcionario Funcionario(Cliente cl) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String listarCliente(){
		List<Cliente> pessoas = daocliente.readAll();
		String texto="-----------listagem de Pessoas-----------\n";
//		for (Cliente cl : Clientes) {
//			texto += cl +"\n";
//		}
//		return texto;
		return texto;
	}
	
	public static String listarFuncionario(){
		List<Funcionario> clientes = daofuncionario.readAll();
		String texto="-----------listagem de Funcionarios-----------\n";
		for (Funcionario a : clientes) {
			texto += a +"\n";
		}
		return texto;
	}
	public static void excluirCliente(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	}
