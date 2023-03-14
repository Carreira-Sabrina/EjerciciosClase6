package calculadoraConJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testMultiplicar() {
		double a = 80;
		double b =3;
		double resultado = Calculadora.multiplicar(a, b);
		double resultadoEsperado = 240;
		assertEquals(resultadoEsperado,resultado,0.01);
		
	}

	@Test
	public void testSumarYDividir() {
		double a = 150;
		double b =180;
		double c=3;
		double resultado = Calculadora.dividir(Calculadora.sumar(a, b),c);
		double resultadoEsperado = 110;
		assertEquals(resultadoEsperado,resultado,0.01);
	}

	@Test
	public void testRestarYMultiplicar() {
		double a = 90;
		double b =50;
		double c=15;
		double resultado = Calculadora.multiplicar(Calculadora.restar(a, b), c);
		double resultadoNoEsperado = 605;
		assertNotEquals(resultadoNoEsperado,resultado,0.01);
	}

	

	@Test
	public void sumarYMultiplicar() {
		double a = 70;
		double b =40;
		double c=25;
		double resultado = Calculadora.multiplicar(Calculadora.sumar(a, b), c);
		double resultadoNoEsperado = 605;
		assertNotEquals(resultadoNoEsperado,resultado,0.01);
		
	}

}
