
public class NegocioMock implements InterfaceNegocio {
	private boolean foiAcessado = false;

	@Override
	public void executaTransacao() {
		// TODO Auto-generated method stub
		foiAcessado = true;
	}

	@Override
	public void cancelaTransacao() {
		// TODO Auto-generated method stub
		foiAcessado = true;
	}
	
	public boolean foiAcessado(){
		return foiAcessado;
	}
}
