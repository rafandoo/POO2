package com.persistencias;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
		data.setText(DataUtil.)
	}
}
