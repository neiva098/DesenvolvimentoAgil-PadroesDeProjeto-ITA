
public class CalculoDiaria implements Calculo {
	private int valorDiaria;

	public CalculoDiaria(int valorDiaria) {
		// TODO Auto-generated constructor stub
		this.valorDiaria = valorDiaria;
	}

	@Override
	public int calcularTarifa(int qtdHoras) {
		// TODO Auto-generated method stub
		int valor = valorDiaria * (int) Math.ceil(qtdHoras / 24.0);

		return valor;
	}

}
