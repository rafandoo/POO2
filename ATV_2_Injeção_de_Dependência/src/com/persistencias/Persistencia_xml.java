package com.persistencias;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import com.classes.Aluno;
import util.DataUtil;

public class Persistencia_xml {

	final static String NOMEDOARQUIVO = "alunos";
	final static String LOCALHOST = "xml/";
	
	public static boolean gravarXML(List<Aluno> lista) {
		Element config = new Element("Alunos");
		Document documento = new Document(config);
		
		Element titulo = new Element("titulo");
		titulo.setText("Cadastro de Alunos");
		
		Element data = new Element("data");
		data.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
		
		config.addContent(titulo);
		config.addContent(data);
		
		for(int i = 0; i < lista.size(); i++) {
			Element aluno = new Element("aluno");
			
			aluno.setAttribute("matricula", String.valueOf(lista.get(i).getMatricula()));
			
			Element nome = new Element("nome");
			nome.setText(lista.get(i).getNome());
			
			Element cpf = new Element("cpf");
			cpf.setText(lista.get(i).getCpf());
			
			Element data_nascimento = new Element("data nascimento");
			data_nascimento.setText(lista.get(i).getData_nascimento());
			
			Element email = new Element("email");
			email.setText(lista.get(i).getEmail());
			
			aluno.addContent(nome);
			aluno.addContent(cpf);
			aluno.addContent(data_nascimento);
			aluno.addContent(email);
		}
		
		XMLOutputter xout = new XMLOutputter();
		
		try {
			System.out.println(NOMEDOARQUIVO + ".xml");
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(LOCALHOST + NOMEDOARQUIVO + ".xml"), "UTF-8"));
			xout.output(documento, arquivo);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
