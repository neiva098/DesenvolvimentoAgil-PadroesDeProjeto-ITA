import static org.junit.Assert.*;

import org.junit.Test;

public class TesteGeradorNome {
	@Test
	public void nomeBase() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarPessoa().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Eduardo", nome);
	}

	@Test
	public void mestre() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarMestre().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Mestre Eduardo", nome);
	}

	@Test
	public void doutor() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarDoutor().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Doutor Eduardo", nome);
	}

	@Test
	public void exelentissimoDoutor() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarDoutor().excelentissimo().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Excelentissimo Doutor Eduardo", nome);
	}

	@Test
	public void magnificoMestre() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarMestre().magnifico().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Magnifico Mestre Eduardo", nome);
	}

	@Test
	public void excelentissimoMagnificoDoutor() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarDoutor().excelentissimo().magnifico().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Excelentissimo Magnifico Doutor Eduardo", nome);
	}

	@Test
	public void pessoaDeJuizDeFora() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarPessoa().de("Juiz de Fora").gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Eduardo de Juiz de Fora", nome);
	}

	@Test
	public void magnificoDoutorDeJuizDeForaDeSaoJose() {
		GeradorNome gn = new GeradorNomeBuilder()
				.criarDoutor().magnifico().de("Juiz de Fora").de("Sao Jose").gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Magnifico Doutor Eduardo de Juiz de Fora de Sao Jose", nome);
	}
}
