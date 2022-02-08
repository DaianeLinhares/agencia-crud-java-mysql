package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connection.MySqlConnection;
import model.Contato;

public class ContatoService {
	public static void save() {

		Scanner x = new Scanner(System.in);

		Contato contato = new Contato();
		System.out.println("-----Cadastro Contato------");
		System.out.println("Nome: ");
		contato.setNomeContato(x.nextLine());
		System.out.println("Email: ");
		contato.setEmailContato(x.nextLine());
		System.out.println("mensagem: ");
		contato.setMensagemContato(x.nextLine());

		String sql = "INSERT INTO contato(nomeContato,emailContato,mensagemContato) VALUES (?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getNomeContato());
			pstm.setString(2, contato.getEmailContato());
			pstm.setString(3, contato.getMensagemContato());

			pstm.execute();
			System.out.println("Contato cadastrado com sucesso");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void update() {

		Scanner x = new Scanner(System.in);
		System.out.println("-----update Contato-----");
		Contato contato = new Contato();
		System.out.println("Digite id Contato: ");
		contato.setIdContato(x.nextInt());
		x.nextLine();
		System.out.println("Nome: ");
		contato.setNomeContato(x.nextLine());
		System.out.println("Email: ");
		contato.setEmailContato(x.nextLine());
		System.out.println("Mensagem: ");
		contato.setMensagemContato(x.nextLine());

		String sql = "UPDATE contato set nomeContato = ?, emailContato = ?, mensagemContato= ? where idContato =?";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getNomeContato());
			pstm.setString(2, contato.getEmailContato());
			pstm.setString(3, contato.getMensagemContato());
			pstm.setInt(4, contato.getIdContato());

			pstm.execute();
			System.out.println("atualização tabela  Contato realizado com sucesso .");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void delete() {
		Scanner x = new Scanner(System.in);
		Contato contato = new Contato();
		System.out.println("-----Deletar Contato------");

		System.out.println("Digite Id  de Contado:");
		contato.setIdContato(x.nextInt());

		String sql = ("DELETE FROM contato WHERE idContato = ?");

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, contato.getIdContato());

			pstm.execute();
			System.out.println("deletado");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
