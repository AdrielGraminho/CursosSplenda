package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class CursoApp {

	public static void main(String[] args) {
		try {	
			
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		long cdcurso, valor;
		String nome, url;
		CursoDAO dao = new CursoDAO();
		while (opcao != 6) {
			System.out.println("Sistema de Gerenciamento de Cursos");
			System.out.println("====================================");
			System.out.println("Digite [1] para Consultar todos Cursos");
			System.out.println("Digite [2] para Consultar um Curso específico");
			System.out.println("Digite [3] para Cadastrar um novo Curso");
			System.out.println("Digite [4] para Alterar um Curso");
			System.out.println("Digite [5] para Excluir um Curso");
			System.out.println("Digite [6] para Sair");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {//consultar todos
				System.out.println("[1] Consultar todos");
				List<Curso> cursos = dao.findAll();
				cursos.forEach(System.out::println);
				break;
			}
			case 2: {//consultar
				System.out.println("[2] Consultar um Específico");
				System.out.println("Favor informar o CD do Curso");
				cdcurso = entrada.nextLong();
				System.out.println(dao.find(cdcurso));
				break;
			}
			case 3: {//cadastrar Curso
				System.out.println("[3] Cadastrar um novo Curso");
				System.out.println("Favor informar o cdcurso");
				cdcurso = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o valor");
				valor = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar url");
				url = entrada.nextLine();
				Curso Curso = new Curso(cdcurso, nome, valor, url);
				dao.persist(Curso);
				break;
			}
			case 4: {
				System.out.println("[4] Alterar um Curso");
				System.out.println("Favor informar o cdcurso");
				cdcurso = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o valor");
				valor = entrada.nextLong();
				entrada.nextLine();

				System.out.println("Favor informar url");
				url = entrada.nextLine();
				//inserir(cdcurso, nome, url);
				//inserirPS(cdcurso, nome, url);
				Curso Curso = new Curso(cdcurso, nome, valor, url);
				dao.merge(Curso);
				break;
			}
			case 5: {
				System.out.println("[5] Exluir um Curso");
				System.out.println("Favor informar o cdcurso");
				cdcurso = entrada.nextLong();	
				Curso Curso = dao.find(cdcurso);
				dao.delete(Curso);
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


