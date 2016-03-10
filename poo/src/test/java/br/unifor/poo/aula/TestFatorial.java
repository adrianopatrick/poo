package br.unifor.poo.aula;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFatorial {
	
	private Fatorial fatorial;
	
	@Before
	public void init(){
		fatorial = new Fatorial();
	}

	@Test
	public void testFatorialZero() {
		Assert.assertEquals(1, fatorial.calcula(0));
	}
	
	@Test
	public void testFatorialUm() {
		Assert.assertEquals(1, fatorial.calcula(1));
	}
	
	@Test
	public void testFatorialN() {
		Assert.assertEquals(24, fatorial.calcula(4));
	}

}
