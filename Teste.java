package Teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Classe.Calculadora;

/**
 *
 * @author alefr
 */
public class Teste {
    
    Calculadora calc = new Calculadora();
	
	@Test 
	public void somaPorCinco() {

		double resultado = calc.soma("5", "2");
		Assert.assertEquals(7, resultado, 0.0001);
	}
	
	
	@Test (expected = ArithmeticException.class)
	public void Exception() {

		int i = 1 / 0;
	}
	
	
	@Test
	public void somaMenosUm() {

		double resultado = calc.soma("-1", "1");
		Assert.assertEquals(0, resultado, 0.001);
	}
	
    @Test
    public void raizDeCinco(){
	 
	    double resultado = calc.raizQuadrada("5");
	    Assert.assertEquals(25, resultado, 0.0001);
    }
   
    @Test
    public void raizMenosSete(){
	 
	    double resultado = calc.raizQuadrada("-7");
	    Assert.assertEquals(49, resultado, 0.0001);
    }
    
	
	@Test
	public void dividirPorVinte() {

		double resultado = calc.dividir("20", "2");
		Assert.assertEquals(10, resultado, 0.0001);
	}
	
	
	@Test
	public void dividirPontoFlutuante(){
		 
		double resultado = calc.dividir("7.5", "3");
		Assert.assertEquals(2.5, resultado, 0.081);
	}
	
	
	@Test
	public void dividirSetePorSete() {

		double resultado = calc.dividir("7", "7");
		Assert.assertEquals(1, resultado, 0.0001);
	}
    
}
