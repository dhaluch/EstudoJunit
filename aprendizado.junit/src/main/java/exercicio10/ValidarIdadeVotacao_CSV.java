package exercicio10;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import votacao.Votacao;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class ValidarIdadeVotacao_CSV {
	@Test
	@FileParameters(value = "src/resources/massaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	public void testeValidaIdade_CSV(String nome, int anoDeNascimento, String resultado){
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
		String nome2 = nome;
		System.out.println(nome2);
		System.out.println(anoDeNascimento);
	}

}
