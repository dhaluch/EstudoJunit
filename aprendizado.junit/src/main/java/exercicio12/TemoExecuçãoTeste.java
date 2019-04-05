package exercicio12;

import org.junit.Test;
import static org.junit.Assert.*;

public class TemoExecuçãoTeste {

	@Test(timeout = 1000)
	public void naoPassaPeloTimeout() {
		assertTrue(true);
	}

	@Test(timeout = 1000)
	public void apresentaErroTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
	
	
}
