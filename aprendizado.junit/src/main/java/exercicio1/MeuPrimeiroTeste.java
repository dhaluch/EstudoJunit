package exercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MeuPrimeiroTeste {
	@Test
	public void teste1() {
		System.out.println("Teste1 executando");
	}
	@Test
	public void teste2(){
		System.out.println("Teste2 executando");
	}
	public void naoEUmTeste(){
		System.out.println("/esta mensagem não deve aparecer");
	}
}
