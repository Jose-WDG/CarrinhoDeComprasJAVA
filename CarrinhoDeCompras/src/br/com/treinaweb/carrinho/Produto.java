package br.com.treinaweb.carrinho;

/**
 * Classe que representa um produto que pode ser adicionado como item ao
 * carrinho de compras.
 *
 * Importante: Dois produtos são considerados iguais quando ambos possuem o
 * mesmo código.
 */
public class Produto {

	private String nome;
	private String codigo;

	/**
	 * Construtor da classe Produto.
	 *
	 * @param codigo
	 * @param nome
	 */
	public Produto(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	/**
	 * Retorna o nome da produto.
	 *
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o código da produto.
	 *
	 * @return String
	 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
