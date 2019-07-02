package br.com.treinaweb.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Ramalho da silva neto
 * E-mail: neto.silva101@outlook.com
 *
 */

/**
 * Classe que representa o carrinho de compras de um cliente.
 */
public class Carrinho {
	private List<Item> item = new ArrayList<>();
	private int valorUnitario;
	private int quantidade;

	/**
	 * p Permite a adição de um novo item no carrinho de compras.
	 *
	 * Caso o item já exista no carrinho para este mesmo produto, as seguintes
	 * regras deverão ser seguidas:
	 * 
	 * - A quantidade do item deverá ser a soma da quantidade atual com a quantidade
	 * passada como parâmetro. - Se o valor unitário informado for diferente do
	 * valor unitário atual do item, o novo valor unitário do item deverá ser o
	 * passado como parâmetro.
	 *
	 * Devem ser lançadas subclasses de RuntimeException caso não seja possível
	 * adicionar o item ao carrinho de compras.
	 *
	 * @param item
	 * @param valorUnitario
	 * @param quantidade
	 */

	public void adicionarProduto(Item item, int V, int quantidade) {

		try {
			if (!this.item.contains(item)) {
				this.item.add(item);
				item.setValorunitario(V);
				setQuantidade(1);

			} else {
				item.setQuantidade(quantidade);

				if (item.getValorunitario() != V) {
					item.setValorunitario(V);
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro: Ao adicionar o produto: " + e.getMessage());

		}

	}

	@Override
	public String toString() {
		return "Carrinho [valorTotal=" + getValorTotal() + ", total de items=" + tamanhoCarrinho() + "]";
	}

	/**
	 * Permite a remoção do item que representa este produto do carrinho de compras.
	 *
	 * @param produto
	 * @return Retorna um boolean, tendo o valor true caso o produto exista no
	 *         carrinho de compras e false caso o produto não exista no carrinho.
	 */
	public boolean removerItem(Item produto) {
		if (this.item.contains(produto)) {
			this.item.remove(this.item.indexOf(produto));
			System.out.println("Produto: " + produto.getProduto().getNome() + " Removido!");
			return true;
		}
		return false;

	}

	/**
	 * Permite a remoção do item de acordo com a posição. Essa posição deve ser
	 * determinada pela ordem de inclusão do produto na coleção, em que zero
	 * representa o primeiro item.
	 *
	 * @param posicaoItem
	 * @return Retorna um boolean, tendo o valor true caso o produto exista no
	 *         carrinho de compras e false caso o produto não exista no carrinho.
	 */
	public Boolean removerItemPosicao(int posicaoItem) {

		try {
			this.item.remove(posicaoItem);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Item não encontrado, não foi possivel remover o item!: " + e.getMessage());
			return false;
		}

	}

	/**
	 * Retorna o valor total do carrinho de compras, que deve ser a soma dos valores
	 * totais de todos os itens que compõem o carrinho.
	 *
	 * @return BigDecimal
	 */
	public int getValorTotal() {
		int i = 0;
		for (Item item : item) {
			i += item.getValorunitario();
		}
		return i;
	}

	/**
	 * Retorna a lista de itens do carrinho de compras.
	 * 
	 * @return
	 *
	 */
	public String getItem() {
		return item.toString();

	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * retorna o tamanho da lista
	 * 
	 * @return
	 */
	public int tamanhoCarrinho() {
		int tamanho = 0;
		if (this.item.size() >= 0) {
			tamanho = this.item.size();
		}
		return tamanho;
	}
}
