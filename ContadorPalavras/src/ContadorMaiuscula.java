
public class ContadorMaiuscula implements ContadorPalavras {
	
	private int qtd;

	@Override
	public int contagem() {
		// TODO Auto-generated method stub
		return qtd;
	}

	@Override
	public void contar(String palavra) {
		// TODO Auto-generated method stub
		if(Character.isUpperCase(palavra.charAt(0)))
			qtd++;
	}

}
