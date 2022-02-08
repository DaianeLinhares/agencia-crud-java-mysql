package agenciaViagens;

import java.util.Scanner;

import service.ClienteService;
import service.ContatoService;
import service.DestinoService;

public class Dlfviagens {

	public static void main(String[] args) {
		System.out.println();

		Boolean loop = true;
		do {

			System.out.println("--------------------------|");
			System.out.println("|           Menu          |");
			System.out.println("|   0-Sair                |");
			System.out.println("|   1-Adicionar tabelas   |");
			System.out.println("|   2-Atualizar tabelas   |");
			System.out.println("|   3-deletar tabelas     |");
			System.out.println("|                         |");
			System.out.println("|-------------------------|");
			Scanner x = new Scanner(System.in);
			int opcao = x.nextInt();
			ContatoService contatoService = new ContatoService();
			DestinoService destinoService = new DestinoService();
			ClienteService clienteService = new ClienteService();
			switch (opcao) {
			case 0:
				break;

			case 1:
				ClienteService.save();
				DestinoService.save();
				ContatoService.save();
				break;
			case 2:
				ClienteService.update();
				DestinoService.update();
				ContatoService.update();
				break;
			case 3:
				ClienteService.delete();
				DestinoService.delete();
				ContatoService.delete();

			default:
				System.out.println("Opção invalida");
				break;

			}
		} while (loop);
	}
}