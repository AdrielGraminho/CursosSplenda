package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class PagamentoAPP {

	public static void main(String[] args) {
		try {	
			
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		long cpf, cdcurso;
		String datainscricao;
		PagamentoDAO dao = new PagamentoDAO();
		while (opcao != 6) {
			System.out.println("Sistema de Gerenciamento de Pagamentos");
			System.out.println("====================================");
			System.out.println("Digite [1] para Consultar todos Pagamentos");
			System.out.println("Digite [2] para Consultar um Pagamento específico");
			System.out.println("Digite [3] para Cadastrar um novo Pagamento");
			System.out.println("Digite [4] para Alterar um Pagamento");
			System.out.println("Digite [5] para Excluir um Pagamento");
			System.out.println("Digite [6] para Sair");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {//consultar todos
				System.out.println("[1] Consultar todos");
				List<Pagamento> pagamentos = dao.findAll();
				pagamentos.forEach(System.out::println);
				break;
			}
			case 2: {//consultar
				System.out.println("[2] Consultar um Específico");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				System.out.println("Favor informar CDcurso");
				cdcurso = entrada.nextLong();
				PagamentoId pgto = new PagamentoId(cpf,cdcurso);
				System.out.println(dao.find(pgto));
				break;
			}
			case 3: {//cadastrar Pagamento
				System.out.println("[3] Cadastrar um novo Pagamento");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o CdCurso");
				cdcurso = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar a data");
				datainscricao = entrada.nextLine();
				PagamentoId pgto = new PagamentoId(cpf,cdcurso);
				Pagamento Pagamento = new Pagamento(pgto,datainscricao);
				dao.persist(Pagamento);
				break;
			}
			case 4: {
				System.out.println("[3] Cadastrar um novo Pagamento");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o CdCurso");
				cdcurso = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar a data");
				datainscricao = entrada.nextLine();
				PagamentoId pgto = new PagamentoId(cpf,cdcurso);
				Pagamento Pagamento = new Pagamento(pgto,datainscricao);
				dao.merge(Pagamento);
				break;
			}
			case 5: {
				System.out.println("[2] Consultar um Específico");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				System.out.println("Favor informar CDcurso");
				cdcurso = entrada.nextLong();
				PagamentoId pgto = new PagamentoId(cpf,cdcurso);
				Pagamento Pagamento = dao.find(pgto);
				dao.delete(Pagamento);
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
