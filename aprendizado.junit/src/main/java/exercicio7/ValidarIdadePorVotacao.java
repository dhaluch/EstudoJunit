package exercicio7;

import org.junit.Test;

import votacao.Votacao;

import static org.junit.Assert.*;
public class ValidarIdadePorVotacao {
	@Test
	public void idadeIgual15Anos_NaoPodeVotar(){
		assertEquals("Maria voce não pode votar", Votacao.podeVotar("Maria", 2003));
	}
	@Test
	public void idadeIgual17Anos_VotoFacultativo(){
		assertEquals("Joao seu voto é facultativo", Votacao.podeVotar("Joao", 2001));
	}
	@Test
	public void idadeIgual18Anos_VotoObrigatorio(){
		assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2000));
	}
	@Test
	public void idadeIgual25Anos_VotoObrigatorio(){
		assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 1993));
	}
}
