package classes;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	
	
	public static boolean cadastrarProduto(Produto produto) {
		for (Produto p : listaDeProdutos) {
			if(p.equals(produto)) {
				return false;
			}
			
		}
		return listaDeProdutos.add(produto);
	}
	
	public static Produto buscarProdutoNome(String nome) {
		for (Produto p : listaDeProdutos) {
			if(p.getNome().equals(nome)) {
				return p;
			}
			
		}
		return null;
	}
	
	public static Produto buscarProdutoCodigo(String codigo) {
		for ( Produto p : listaDeProdutos) {
			if(p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}

	public static boolean atualizarProduto(String nome, String dataValidade, double preco, String codigo) {
		for(Produto p : listaDeProdutos) {
			if(p.getCodigo().equals(codigo)) {
				p.setNome(nome);
				p.setDataValidade(dataValidade);
				p.setPreco(preco);
			}
			
		}
		return false;
	}
	
	public static boolean removerProduto(Produto produto) {
		for(Produto p : listaDeProdutos) {
			if(p.equals(produto)) {
				return listaDeProdutos.remove(p);
			}
		}
		return false;
	}
	
}
