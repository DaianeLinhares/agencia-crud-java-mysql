package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connection.MySqlConnection;
import model.Cliente;
import model.Contato;

public class ClienteService {

	public static void save() {
		Scanner x = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.println("-----Cadastro Cliente------");
		System.out.println("Nome: ");
		cliente.setNomeCliente(x.next());
		System.out.println("Email: ");
		cliente.setEmailCliente(x.next());
		System.out.println("Senha: ");
		cliente.setSenhaCliente(x.next());
		System.out.println("Endereço: ");
		cliente.setEnderecoCliente(x.next());
		System.out.println("Cidade: ");
		cliente.setCidadeCliente(x.next());
		System.out.println("Uf: ");
		cliente.setUfCliente(x.next());

		String sql = "INSERT INTO Clientes(nomeCliente,emailCliente,senhaCliente,enderecoCliente,cidadeCliente,ufCliente) VALUES(?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNomeCliente());
			pstm.setString(2, cliente.getEmailCliente());
			pstm.setString(3, cliente.getSenhaCliente());
			pstm.setString(4, cliente.getEnderecoCliente());
			pstm.setString(5, cliente.getCidadeCliente());
			pstm.setString(6, cliente.getUfCliente());

			pstm.execute();
			System.out.println("-----Cliente cadastrada com sucesso----");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void update() {
		Scanner x = new Scanner(System.in);

		Cliente cliente = new Cliente();
		System.out.println("----update cliente----");
		System.out.println("Digite Id do cliente: ");
		cliente.setIdCliente(x.nextInt());
		x.nextLine();
		System.out.println("Nome: ");
		cliente.setNomeCliente(x.nextLine());
		System.out.println("Email: ");
		cliente.setEmailCliente(x.nextLine());
		System.out.println("Senha: ");
		cliente.setSenhaCliente(x.nextLine());
		System.out.println("Endereço: ");
		cliente.setEnderecoCliente(x.nextLine());
		System.out.println("Cidade: ");
		cliente.setCidadeCliente(x.nextLine());
		System.out.println("Uf: ");
		cliente.setUfCliente(x.nextLine());

		String sql = "UPDATE clientes set nomeCliente = ?,  emailCliente = ?,  senhaCliente = ?,  enderecoCliente = ?,  cidadeCliente = ?,  ufCliente = ? where idCliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNomeCliente());
			pstm.setString(2, cliente.getEmailCliente());
			pstm.setString(3, cliente.getSenhaCliente());
			pstm.setString(4, cliente.getEnderecoCliente());
			pstm.setString(5, cliente.getCidadeCliente());
			pstm.setString(6, cliente.getUfCliente());
			pstm.setInt(7, cliente.getIdCliente());

			pstm.execute();
			System.out.println("atualização tabela  cliente realizado com sucesso .");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void delete() {
		Scanner x = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("Deletar Cliente");

		System.out.println("Digite Id  de Cliente:");
		cliente.setIdCliente(x.nextInt());

		String sql = ("DELETE FROM clientes WHERE idCliente = ?");

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, cliente.getIdCliente());

			pstm.execute();
			System.out.println("deletado");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}