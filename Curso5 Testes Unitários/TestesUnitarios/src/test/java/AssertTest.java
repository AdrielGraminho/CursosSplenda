import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {

	@Test
	public void test() {
		Assert.assertTrue(true); //sem erro se for true
		Assert.assertFalse(false); //sem erro se for false
		Assert.assertEquals(1, 1); //compara números inteiros
		Assert.assertEquals(0.51, 0.51, 0.01); //compara números double, o último número é a margem de erro
		Assert.assertEquals(Math.PI, 3.14, 0.01);

		int i =5;
		Integer i2 =5;
		Assert.assertEquals(Integer.valueOf(i), i2); // quando comparar tipos primitivos com outros deve se converter
		Assert.assertEquals(i, i2.intValue());
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");

		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		Assert.assertEquals(u1, u2);
		
		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u3, u2);

		
		Assert.assertNull(u3);
	}
}
