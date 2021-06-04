package exercicio4;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class ListElemento {

	// INSTANCIA
	List<Elemento> lista = new ArrayList<Elemento>(); 
	
	// GET
	public List<Elemento> getLista() {
		return lista;
	}
	
	// METODOS
	public boolean inserir(Elemento elemento) {
		return lista.add(elemento);
	}
}
