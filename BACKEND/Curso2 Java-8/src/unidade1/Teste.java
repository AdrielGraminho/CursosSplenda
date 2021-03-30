package unidade1;

public class Teste {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		int i = 0;
		String frases[] = { "um", "dois", "tres" };
		while (i < 4) {
			System.out.println(frases[i]);

			System.out.println("Erro no acesso ao vetor");

			i++;
		}
	}

}
