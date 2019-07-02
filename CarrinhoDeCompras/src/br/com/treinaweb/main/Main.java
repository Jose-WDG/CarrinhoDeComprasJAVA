package br.com.treinaweb.main;

import br.com.treinaweb.carrinho.Carrinho;
import br.com.treinaweb.carrinho.Item;
import br.com.treinaweb.carrinho.Produto;

public class Main {

	public static void main(String[] args) {

		// criando os produtos
		Produto teclado = new Produto("Teclado Gamer", "123123");
		Produto mause = new Produto("Mauser Gamer", "81776279");
		Produto caixaDeSom = new Produto("Caixa de som Gamer", "55817762");
		// criando a carrinho de compras
		Carrinho carrinho = new Carrinho();
		// fazendo referencia ao item
		Item item = new Item(teclado, 1, 1200);
		Item item2 = new Item(mause, 1, 1300);
		Item item3 = new Item(caixaDeSom, 1, 121);

		// add produto
		carrinho.adicionarProduto(item, 1300, 1);
		carrinho.adicionarProduto(item, 1300, 1);
		
		carrinho.adicionarProduto(item2, 1400, 1);
		carrinho.adicionarProduto(item3, 1400, 1);
		// consultando metodos
		System.out.println("===========Lista De Produtos; ===================");
		// mostrando os intens
		System.out.println(item.toString() + "\r\n" + item2.toString() + "\r\n" + item3.toString());
		System.out.println("===============FIM=============");
		System.out.println("Tamanho do carrinho: " + carrinho.tamanhoCarrinho());
		System.out.println(carrinho.toString());
		// removendo o item2
		System.out.println(carrinho.removerItem(item2));
		System.out.println("Tamanho do carrinho: " + carrinho.tamanhoCarrinho());
		// vakir total e total de items no carrinho
		System.out.println(carrinho.toString());
		// recebendo os items que carrinho contem
		System.out.println(carrinho.getItem());

		System.out.println(carrinho.getValorTotal());
	}

}
