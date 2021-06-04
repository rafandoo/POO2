package exercicio4;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class ListElemento {


	private List<Elemento> lista = new ArrayList<Elemento>();
	
	public boolean inserir(Elemento elemento) {
		if (!existeChave(elemento)) {
			return lista.add(elemento);
		} else {
			return false;
		}
	}
	
	public Elemento busca(String chave) {
		for (Elemento elemento : lista) {
			if(chave.equals(elemento.getChave())) {
				return elemento;
			}
		}
		return null;
	}
	
	public boolean existeChave(Elemento e) {
		for (Elemento elemento : lista) {
			if(e.getChave().equals(elemento.getChave())) {
				return true;
			}
		}
		return false;
	}
	
	
}
