
public class DescontoAbsoluto implements Desconto {
	private double valorDesconto;

	public DescontoAbsoluto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	@Override
	public double darDesconto(double valorOriginal) {
		// TODO Auto-generated method stub
		return valorOriginal - valorDesconto;
	}

}
