package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connection.MySqlConnection;
import model.Cliente;

public class ClienteService {

	public void save() {
		Scanner x = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.println("Cadastro Cliente");

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
		System.out.println("UF: ");
		cliente.setUfCliente(x.nextLine());

		String sql = "INSER VALUES Clientes(nome,email,senha,endereco,cidade,uf) VALUES(?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
