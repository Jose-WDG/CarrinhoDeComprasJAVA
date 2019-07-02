package br.com.treinaweb.carrinho;

public class Item {
	private int quantidade;
	private int valorUnitario;
	private Produto produto;
	private int valorTotal;

	/**
	 * Construtor da classe Item.
	 * 
	 * @param produto
	 * @param valorUnitario
	 * @param quantidade
	 */
	public Item(Produto produto, int quantidade, int valorUnitario) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.produto = produto;
	}

	/**
	 * Retorna o produto.
	 *
	 * @return Produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * Retorna o valor unitário do item.
	 *
	 * @return BigDecimal
	 */
	public int getValorunitario() {
		return valorUnitario;
	}

	public void setValorunitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	/**
	 * Retorna a quantidade do item.
	 *
	 * @return int
	 */
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	/**
	 * Retorna o valor total do item.
	 *
	 * @return BigDecimal
	 */
	public int getValorTotal() {
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Item [quantidade=" + getQuantidade() + ", valorUnitario=" + valorUnitario + ", produto=" + produto.getNome()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + quantidade;
		result = prime * result + valorUnitario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (valorTotal != other.valorTotal)
			return false;
		if (valorUnitario != other.valorUnitario)
			return false;
		return true;
	}

}
