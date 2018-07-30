package org.gradle;

import org.junit.Assert;
import org.junit.Test;

public class CadenasTest {
	
	Cadenas cadenas = new Cadenas();
	
	@Test
	public void concatenarCadenasTest() {
		String resultado = cadenas.concatenar("Hola ", "chicos");	
		Assert.assertTrue("Hola chicos".equals(resultado));
	}
	
	
	public void concatecarNuloTest() {
		cadenas.concatenar(1,2);
	}

}
