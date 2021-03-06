package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class ClienteApp {

	public static void main(String[] args) {
		try {	
			
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		long cpf;
		String nome, email;
		ClienteDAO dao = new ClienteDAO();
		while (opcao != 6) {
			System.out.println("Sistema de Gerenciamento de Clientes");
			System.out.println("====================================");
			System.out.println("Digite [1] para Consultar todos clientes");
			System.out.println("Digite [2] para Consultar um Cliente específico");
			System.out.println("Digite [3] para Cadastrar um novo cliente");
			System.out.println("Digite [4] para Alterar um cliente");
			System.out.println("Digite [5] para Excluir um cliente");
			System.out.println("Digite [6] para Sair");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {//consultar todos
				System.out.println("[1] Consultar todos");
				List<Cliente> clientes = dao.findAll();
				clientes.forEach(System.out::println);
				break;
			}
			case 2: {//consultar
				System.out.println("[2] Consultar um Específico");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				System.out.println(dao.find(cpf));
				break;
			}
			case 3: {//cadastrar cliente
				System.out.println("[3] Cadastrar um novo cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o email");
				email = entrada.nextLine();
				//inserir(cpf, nome, email);
				//inserirPS(cpf, nome, email);
				Cliente cliente = new Cliente(cpf, nome, email);
				dao.persist(cliente);
				break;
			}
			case 4: {
				System.out.println("[4] Alterar um cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o email");
				email = entrada.nextLine();
				Cliente cliente = new Cliente(cpf, nome, email);
				dao.merge(cliente );
				break;
			}
			case 5: {
				System.out.println("[5] Exluir um cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();	
				Cliente cliente = dao.find(cpf);
				dao.delete(cliente);
				break;
			}
			case 6: { //sair
				System.out.println("Encerrando o sistema...");
				break;
			}
			}

		}
		}catch (Exception e) {

			e.printStackTrace();
		}
	}

}

