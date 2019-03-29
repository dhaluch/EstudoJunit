package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;

@RunWith(Suite.class)
@SuiteClasses({ MeuPrimeiroTeste.class, ValidacaoVerdadeiroFalso.class, ValidacaoIgualdade.class, })

public class SuiteDeTeste {

}
