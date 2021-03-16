package unidade3;

public class NotaAluno {
	
	double valor;
	
	<T extends Number> NotaAluno( T obj){
		valor = obj.doubleValue();
		
	}

	<T extends Number> double retornaValor(T obj) {
		return obj.doubleValue();
	}
}
