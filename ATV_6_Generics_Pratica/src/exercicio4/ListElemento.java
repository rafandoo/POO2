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
		if(equals(elemento.getChave())) {
			return lista.add(elemento);
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
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
		ListElemento other = (ListElemento) obj;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}
	
	
	
}
