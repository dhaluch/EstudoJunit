package exercicio13;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacaoFluente {
	@Test
	public void calidacaoEqualTo(){
		String produto = "TV 40 polegadas";
		assertThat(produto, equalTo("TV 40 polegadas"));
	}
	@Test
	public void validacaoIs(){
		int codigo = 50;
		assertThat(codigo, is(50));
	}
	@Test
	public void validaAnyof(){
		String resultadoObtido = "A cor selecionada foi vermelha";
		assertThat(resultadoObtido, anyOf(containsString("vermelha"), containsString("vermelho")));
	}
	@Test
	public void validacaoHasItem(){
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("iphone 8 plus 64gb");
		listaProdutos.add("adaptador usb-c vga");
		listaProdutos.add("apple tv 4 geracao");
		assertThat(listaProdutos, hasItem("adaptador usb-c vga"));
	}
}
