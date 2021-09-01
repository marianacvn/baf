package classes;

public class Produto {
	private String nome;
	private String codigo;
	private double preco;
	private String dataValidade;
	
	public Produto(String nome, String codigo, double preco, String dataValidade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
}
