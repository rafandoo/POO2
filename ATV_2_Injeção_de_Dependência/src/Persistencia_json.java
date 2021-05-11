import java.io.BufferedReader;
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
		lista.add(aluno);
		FileWriter writer = new FileWriter("json/alunos.json");
		writer.write(gson.toJson(lista));
		writer.close();
	}
	
	public String saida() {
		return gson.toJson(lista);
	}
	
	
}
