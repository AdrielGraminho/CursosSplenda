package unidade5;

public class CalculadoraV2 {

	public static void main(String[] args) {

		CalculadoraV2 objeto = new CalculadoraV2();
		IMatch somar = (a, b) -> a + b;
		IMatch subtrair = (a, b) -> a - b;
		IMatch multiplicar = (a, b) -> a * b;
		IMatch dividir = (a, b) -> a / b;
		IMatch exponenciacao = (a, b) -> Math.pow(a, b);
		IMatch radiciacao = (a, b) -> Math.pow(a, 1 / b);

		System.out.println(objeto.execOperacao(5, 3, somar));
		System.out.println(objeto.execOperacao(5, 3, subtrair));
		System.out.println(objeto.execOperacao(5, 3, multiplicar));
		System.out.println(objeto.execOperacao(5, 3, dividir));
		System.out.println(objeto.execOperacao(5, 3, exponenciacao));
		System.out.println(objeto.execOperacao(5, 3, radiciacao));

	}

	public double execOperacao(double a, double b, IMatch op) {
		return op.operacao(a, b);
	}

}
