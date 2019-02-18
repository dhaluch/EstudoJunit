package exercicio8;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;
public class ValidarIdadePorVotacao_DDT {
	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado){
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
		
	}
	@Test
	public void validarObrigatoriedadeDeVoto(){
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][] {
			{"Maria", 2003, "Maria voce não pode votar"},
		});
	}
	
	
}
