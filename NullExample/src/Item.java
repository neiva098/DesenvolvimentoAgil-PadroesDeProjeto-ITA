
public class Item {
	private String nome;
	private double valor;
	private Desconto desconto;

	public Item(String nome, double valor, Desconto desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}

	public Item(String nome, double valor) {
		// this(nome, valor, null);
		this(nome, valor, new SemDesconto());
	}

	public double precoQuantidade(int quantidade) {
		/*
		 * if (desconto != null) { return desconto.darDesconto(valor) * quantidade; }
		 * else { return valor * quantidade; }
		 */
		return desconto.darDesconto(valor) * quantidade;
	}

	public String toString() {
		/*
		 * if (desconto != null) { return nome + " R$" + desconto.darDesconto(valor); }
		 * else { return nome + " R$" + valor; }
		 */
		return nome + " R$" + desconto.darDesconto(valor);
	}
}
