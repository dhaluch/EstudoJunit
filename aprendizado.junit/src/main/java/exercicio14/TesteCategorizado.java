package exercicio14;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.theories.suppliers.TestedOn;

import categorias.Positivos;
import categorias.Smoke;

public class TesteCategorizado {
	@Test
	@Category(Smoke.class)
	public void teste1(){
		System.out.println("TEste 1");
	}
	@Test
	@Category(Positivos.class)
	public void teste2(){
		System.out.println("TEste 2");
	}
	@Test
	public void teste3(){
		System.out.println("TEste 3");
	}
}
