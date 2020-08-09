import static org.junit.Assert.*;
import org.junit.Test;

public class TesteProxySeguranca {
	@Test
	public void testAutorizaAcesso() {
		Usuario Cris = new Usuario("Cris");
		Cris.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock, Cris);
		n.executaTransacao();
		assertEquals(mock.foiAcessado(), true);

	}

	@Test
	public void testNaoAutorizaAcesso() {
		Usuario Cris = new Usuario("Cris");
		Cris.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock, Cris);
		try {
			n.cancelaTransacao();
			fail();
		} catch (Exception e) {

			assertFalse(mock.foiAcessado());
		}

	}

}