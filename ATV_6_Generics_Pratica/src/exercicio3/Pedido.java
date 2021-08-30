package exercicio3;

import java.util.ArrayList;

import java.util.List;

public class Pedido {
	
	// ATRIBUTOS
	//ProdutoX px;
	
	// INSTANCIAS
	List<? extends ProdutoX> produtos = new ArrayList<>();

	// METODOS
	public boolean inserir(ProdutoX px) {
		return false;
		//return produtos.add((Collection<?>) new ProdutoX());
		
	}
	
	
}
