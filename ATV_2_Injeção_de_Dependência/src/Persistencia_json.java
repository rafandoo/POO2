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

	//CONSTRUTOR
	public Persistencia_json(Aluno aluno) {
		setAluno(aluno);
		lista.add(aluno);
	}
	
	//INTANCIAS
	List<Aluno> lista = new ArrayList<Aluno>();
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	
	//ATRIBUTOS
	Aluno aluno;
	
	//GET E SET
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	//METODOS
	public void gerarJson() throws IOException {
		FileWriter writer = new FileWriter("json/alunos.json");
		writer.write(gson.toJson(lista));
		writer.close();
	}
	

	public String lerJson() throws FileNotFoundException {
		builder = new GsonBuilder();
		gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("json/alunos.json"));
		
		Type listType = new TypeToken<ArrayList<Aluno>>(){}.getType();
		
		lista = new ArrayList<Aluno>();
		lista = new Gson().fromJson(bufferedReader, listType);
		
		String msg = "";
		
		for(Iterator<Aluno> iterator = lista.iterator(); iterator.hasNext();) {
			Aluno al = (Aluno) iterator.next();
			msg += al.toString();
		}
		return (msg);
	}
	
	public String saida() {
		return gson.toJson(lista);
	}
	
	
}
