import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Persistencia_json {

	// CONSTRUTOR
	public Persistencia_json() {

	}

	// INTANCIAS
	List<Aluno> lista = new ArrayList<Aluno>();
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();

	// METODOS
	public boolean addListaJson(Aluno aluno) {
		return (lista.add(aluno));
	}

	public void gerarJson() throws IOException {
		FileWriter writer = new FileWriter("json/alunos.json");
		writer.write(gson.toJson(lista));
		writer.close();
	}

	public String lerJson() throws FileNotFoundException {
		builder = new GsonBuilder();
		gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("json/alunos.json"));
		Type listType = new TypeToken<ArrayList<Aluno>>() {
		}.getType();
		lista = new ArrayList<Aluno>();
		lista = new Gson().fromJson(bufferedReader, listType);

		String msg = "";
		for (Iterator<Aluno> iterator = lista.iterator(); iterator.hasNext();) {
			Aluno al = (Aluno) iterator.next();
			msg += al.toString() + "\n";
		}
		return (msg);
	}

	// FINS DE TESTE
	public String saida() {
		return gson.toJson(lista);
	}

}
