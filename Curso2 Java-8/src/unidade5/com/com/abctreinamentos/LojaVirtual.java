package unidade5.com.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {

	static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();
	
	public static void listarCursos(List<Curso> lista) {
		lista.forEach(p->System.out.println(p.getCdCurso()+"<''>"+p.getNome()));
	}
	public static void main(String[] args) {
		// criar os cursos disponíveis no site para venda
		


		Curso java8 = new Curso(1, "Java8", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle12c", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(3, "PHP7", 1500, Paths.get("/php7"));

		// cadastrar cliente
		Cliente adriel = new Cliente("872.000.000-04", "Adriel", "adrielgraminho@gmail.com");

		// criar lista de cursos do cliente
		List<Curso> cursoAdriel = new LinkedList<Curso>();

		// fazer um checkout dos cursos escolhidos
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 4) {
			System.out.println("Qual curso deseja adquirir: [1-Java8], [2-Oracle12c], [3-PHP7], [4-Finalizar Compra]");
			opcao = entrada.nextInt();

			if (opcao == 1)
				cursoAdriel.add(java8);
			else if (opcao == 2)
				cursoAdriel.add(oracle12c);
			else if (opcao == 3)
				cursoAdriel.add(php7);
			else
				opcao = 4;

		}
		
		entrada.close();
		pagamentos.put(adriel, cursoAdriel);
		System.out.println(pagamentos);
		listarCursos(cursoAdriel);
	}
}
