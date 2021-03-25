package unidade5;

public class Calculadora implements Formula {

	public static void main(String[] args) {

		IMatematica objeto = new IMatematica() {
			
			@Override
			public int subtrair(int a, int b) {
				return (a-b);
			}
			
			@Override
			public int somar(int a, int b) {
				return (a+b);
			}
			
			@Override
			public int multiplicar(int a, int b) {
				return (a*b);
			}
			
			@Override
			public int dividir(int a, int b) {
				return (a/b);
			}

			@Override
			public double potenciacao(double a, double b) {
				return (Math.pow(a, b));
			}

			@Override
			public double radiciacao(double a, double b) {
				return Math.pow(a, 1/b);
			}
		};
		System.out.println(objeto.getClass());
		System.out.println(objeto.somar(5,5));
		System.out.println(objeto.subtrair(5,5));
		System.out.println(objeto.multiplicar(5,5));
		System.out.println(objeto.dividir(5,5));
		System.out.println(objeto.potenciacao(5,5));
		System.out.println(objeto.radiciacao(5,5));

	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

}
