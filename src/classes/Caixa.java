package classes;



public class Caixa {
		
	
	public static boolean Cadastrarproduto(Produto produto) {
		return BaseDados.cadastrarProduto(produto);
		
	}
	
	public static boolean removerProduto(Produto produto) {
		return BaseDados.removerProduto(produto);
	}
	
	public static Produto buscarProdutoNome(String nome) {
		return BaseDados.buscarProdutoNome(nome);
	
	}
	
	public static Produto buscarProdutoCodigo(String codigo) {
		return BaseDados.buscarProdutoCodigo(codigo);
		
	}
	
	
	
	
	}
