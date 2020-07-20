
public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(int percentual) {
        this.percentual = percentual;
    }

	@Override
	public double darDesconto(double valorOriginal) {
		// TODO Auto-generated method stub
		return (100.0 - percentual) / 100 * valorOriginal;
	}

}
