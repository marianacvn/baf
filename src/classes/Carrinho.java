package classes;

import java.util.ArrayList;

public class Carrinho {
	public static ArrayList<Produto> listaDeCompras = new ArrayList<>();
	public static double totalCompra;

	public static void AdicionarProdutoNome(String nome) {
		Produto produto = BaseDados.buscarProdutoNome(nome);
		if(produto != null) {
			listaDeCompras.add(produto);
		}
	}
	
	public static void AdicionarProdutoCodigo(String codigo ) {
		Produto produto = BaseDados.buscarProdutoCodigo(codigo);
		if(produto != null) {
			listaDeCompras.add(produto);
		}
	}
	
	public static void removerProduto(String nome) {
		Produto produto = BaseDados.buscarProdutoNome(nome);
		if(produto.getNome().equals(nome)) {
			listaDeCompras.remove(produto);
		}
	}
	
	private static void totalizarCompra() {
		for(Produto p : listaDeCompras) {
			totalCompra = totalCompra + p.getPreco();
		}
	}
	
	public static void resumirCompra() {
		totalizarCompra();
		System.out.println("------- NOTA -------");
		System.out.println("------- NOME --------- PREÇO");
		for (Produto produto : listaDeCompras) {
			System.out.println(produto.getNome() + "--------------" + produto.getPreco());
		}
		System.out.println("------TOTAL-----"+ totalCompra);
	}

}
