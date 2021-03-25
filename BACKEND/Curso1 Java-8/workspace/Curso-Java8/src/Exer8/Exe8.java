package Exer8;
import org.junit.Test;

public class Exe8 {
	@Test
	public void exe8(){
		Calabreza calabreza = new Calabreza();
		Napolitana napolitana = new Napolitana();
		Forno forno = new Forno();
	 	forno.assar(calabreza);
	 	forno.assar(napolitana);
	}
}
