package service;

import java.util.Scanner;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Cliente;
import model.Destino;

public class DestinoService {

	public static void save() {

		Scanner x = new Scanner(System.in);
		System.out.println("-----Cadastrar Destino------");
		Destino destino = new Destino();
		System.out.println("Nome: ");
		destino.setNomeDestino(x.nextLine());
		System.out.println("Preço: ");
		destino.setPrecoDestino(x.nextDouble());

		String sql = "INSERT INTO destino(nomeDestino,precoDestino) VALUES (?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getNomeDestino());
			pstm.setDouble(2, destino.getPrecoDestino());

			pstm.execute();
			System.out.println("Destino Cadastrada com sucesso");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void update() {

		Scanner x = new Scanner(System.in);
		System.out.println("-----update destino-----");
		Destino destino = new Destino();
		System.out.println("Digite id Destino: ");
		destino.setIdDestino(x.nextInt());
		x.nextLine();
		System.out.println("Nome: ");
		destino.setNomeDestino(x.nextLine());
		System.out.println("Preço: ");
		destino.setPrecoDestino(x.nextDouble());

		String sql = "UPDATE destino set nomeDestino =?, precoDestino =? where idDestino =?";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getNomeDestino());
			pstm.setDouble(2, destino.getPrecoDestino());
			pstm.setInt(3, destino.getIdDestino());

			pstm.execute();
			System.out.println("Destino atualizado com sucesso");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void delete() {

		Scanner x = new Scanner(System.in);

		Destino destino = new Destino();
		System.out.println("-----deletar destino------");

		System.out.println("Digite IdDestino: ");
		destino.setIdDestino(x.nextInt());

		String sql = ("DELETE FROM destino WHERE idDestino = ?");

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = MySqlConnection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, destino.getIdDestino());

			pstm.execute();
			System.out.println("deletado");
			conn.close();
			pstm.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
