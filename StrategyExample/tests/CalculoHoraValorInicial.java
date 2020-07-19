
public class CalculoHoraValorInicial implements Calculo {
	private int valorInicial;
	private int limiteHoraInicial;
	private int valorHoraExcedente;

	public CalculoHoraValorInicial(int valorInicial, int limiteHoraInicial, int valorHoraExcedente) {
		// TODO Auto-generated constructor stub
		this.valorInicial = valorInicial;
		this.limiteHoraInicial = limiteHoraInicial;
		this.valorHoraExcedente = valorHoraExcedente;
	}

	@Override
	public int calcularTarifa(int qtdHoras) {
		// TODO Auto-generated method stub
		int valor = this.valorInicial;
		
		if (qtdHoras > this.limiteHoraInicial) valor += (qtdHoras - this.limiteHoraInicial) * this.valorHoraExcedente;
		
		return valor;
	}

}
