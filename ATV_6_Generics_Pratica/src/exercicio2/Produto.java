package exercicio2;

public class Produto<T> {
	
	// CONSTRUTORES
	
	// ATRIBUTOS
	private T id;
	private String produto;
	private double valor;
	private String dataFabricacao;
	private String dataVencimento;
	
	// GETTERS E SETTERS
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		if(produto.length() > 0) {
			this.produto = produto;
		}
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		if(dataFabricacao.length() > 0) {
			this.dataFabricacao = dataFabricacao;
		}
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		if(dataVencimento.length() > 0) {
			this.dataVencimento = dataVencimento;
		}
	}
	
	// SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id: ");
		builder.append(id);
		builder.append(", produto: ");
		builder.append(produto);
		builder.append(", valor: ");
		builder.append(valor);
		builder.append(", dataFabricacao: ");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento: ");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
}
