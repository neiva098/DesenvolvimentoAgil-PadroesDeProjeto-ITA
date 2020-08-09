import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<String> permissoes;

	public Usuario(String nome) {
		this.setNome(nome);
		this.permissoes = new ArrayList<>();
	}

	public void autorizaAcesso(String classe, String metodo) {
		permissoes.add(classe + ":" + metodo);
	}

	public boolean verificaPermissao(String classe, String metodo) {
		return permissoes.contains(classe + ":" + metodo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
