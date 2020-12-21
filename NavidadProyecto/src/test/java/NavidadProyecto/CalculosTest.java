package NavidadProyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculosTest {

	private Calculos calculos = new Calculos();
	private int resultadoInt;
	private double resultadoDouble;
	private int x, y;
	
	@Test
	public void testSuma() {
		x=4;
		y=7;
		
		resultadoInt = calculos.suma(x, y);
		
		assertEquals(11, resultadoInt);
	}
	
	@Test
	public void testResta() {
		x=4;
		y=7;
		
		resultadoInt = calculos.resta(x, y);
		
		assertEquals(-3, resultadoInt);
	}
	
	@Test
	public void testDivisionDistinto0Divisor() {
		x=4;
		y=7;
		
		resultadoDouble = calculos.division(x, y);
		
		assertEquals(0.57, resultadoDouble, 0.002);
	}
	
	@Test
	public void testDivisionDivisorIgual0() {
		x=4;
		y=0;
		
		resultadoDouble = calculos.division(x, y);
		
		assertEquals(-1, resultadoDouble, 0);
	}

}
