import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bank.study.Calculo;

public class EnsinoTest {

	@Test
	public void soma() {
		
		int a = 10;
		int b = 20;
		
		int resultado = Calculo.soma(a, b);
		
		assertEquals(30, resultado);
	}
	
	@Test
	public void soma2() {
		
		int a = 20;
		int b = 20;
		
		int resultado = Calculo.soma(a, b);
		
		assertEquals(40, resultado);

	}
	
	@Test
	public void subtrair() {
		int a = 50;
		int b = 20;
		
		int resultado = Calculo.subtrair(a, b);
		
		assertEquals(30, resultado);
	}
	
}
