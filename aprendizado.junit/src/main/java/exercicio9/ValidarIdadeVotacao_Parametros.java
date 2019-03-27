package exercicio9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import junitparams.Parameters;
import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadeVotacao_Parametros {
   
   @Parameter(0)  public String nome;
   @Parameter (1) public int anoDeNascimento;
   @Parameter (2) public String resultado;
   
   @Test
	public void validarObrigatoriedadeDeVoto(){
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
   
  @org.junit.runners.Parameterized.Parameters
   public static Collection<Object[]> data(){
	   return Arrays.asList(new Object [] []{
		   {"Maria", 2004, "Maria voce nao pode votar"},
			{"Rodrigo", 2003, "Rodrigo seu voto e facultativo"},
			{"Joao", 2001, "Joao seu voto e obrigatorio"},
			{"Carla", 2000, "Carla seu voto e obrigatorio"},
			{"Jose", 1993, "Jose seu voto e obrigatorio"},
			{"Ana", 1950, "Ana seu voto e obrigatorio"},
			{"Pedro", 1947, "Pedro seu voto e facultativo"}
	   });
   }
}
