package app;

 import classes.Caixa;
import classes.Carrinho;
import classes.Produto;

public class App {
	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		Produto produto = new Produto("Salsicha", "234657", 8.0, "26/04/2022");
		Caixa.Cadastrarproduto(produto);
		Produto produto2 = new Produto("Pão de Caixa", "3646647", 5.50, "30/03/2023");
		Caixa.Cadastrarproduto(produto2);
		Produto produto3 = new Produto("Maionese", "2727283", 3.0, "02/07/2022");
		Caixa.Cadastrarproduto(produto3);
		
		Carrinho.AdicionarProdutoNome("Maionese");
		Carrinho.AdicionarProdutoNome("Salsicha");
		
		Carrinho.resumirCompra();
		
		
		
		
	}

}
