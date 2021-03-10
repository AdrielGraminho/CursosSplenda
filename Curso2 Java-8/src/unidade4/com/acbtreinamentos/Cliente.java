package unidade4.com.acbtreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	
	Set<Curso> cursos;
	
	public static void main(String[] args) {
		
		Curso java8 = new Curso("Java8");
		Curso oracle12c = new Curso("Oracle12c");
		
		Set<Curso> cursosA = new HashSet<Curso>();
		Set<Curso> cursosB = new HashSet<Curso>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		
		cursosB.add(java8);

		//inteseção
		
		cursosA.removeAll(cursosB);
		System.out.println("A intersec b " + cursosA);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		A.setCursos(cursosB);
		
		}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
