package com.classes;

import com.classes.BO.*;
import com.classes.DTO.*;
import com.classes.service.MatriculaService;

public class Main {

    public static void main(String[] args) {

        // CURSO
        CursoBO cbo = new CursoBO();
        Curso bcc = cbo.criar("Ciência da Computação");

        // PROFESSORES
        ProfessorBO pbo = new ProfessorBO();
        Professor profe1 = pbo.criar(1234, "Fulano", "fulano@mail.com");
        Professor profe2 = pbo.criar(4321, "Ciclano", "ciclano@mail.com");
        Professor profe3 = pbo.criar(5678, "Beltrano", "beltrano@mail.com");
        Professor profe4 = pbo.criar(8765, "Deltrano", "deltrano@mail.com");

        // COORDENADOR
        CoordenadorBO coobo = new CoordenadorBO();
        Coordenador coordenador = coobo.criar(profe1, bcc);

        // FASES
        FaseBO fbo = new FaseBO();
        Fase fase1 = fbo.criar(1);
        Fase fase2 = fbo.criar(2);

        cbo.adicionarFases(bcc, fase1);
        cbo.adicionarFases(bcc, fase2);


        // DISCIPLINAS
        DisciplinaBO dbo = new DisciplinaBO();
        Disciplina d1 = dbo.criar(1, "POO");
        Disciplina d2 = dbo.criar(2, "BD");
        Disciplina d3 = dbo.criar(3, "POO2");
        Disciplina d4 = dbo.criar(4, "IA");
        Disciplina d5 = dbo.criar(5, "SO");

        // DISCIPLINAS OFERTADAS
        DisciplinaOfertadaBO dobo = new DisciplinaOfertadaBO();
        DisciplinaOfertada disciplinaOfertada1 = dobo.criar(d1);
        DisciplinaOfertada disciplinaOfertada2 = dobo.criar(d2);
        DisciplinaOfertada disciplinaOfertada3 = dobo.criar(d3);
        DisciplinaOfertada disciplinaOfertada4 = dobo.criar(d4);

        dobo.adicionarProfessor(disciplinaOfertada1, profe1);
        dobo.adicionarProfessor(disciplinaOfertada1, profe2);
        dobo.adicionarProfessor(disciplinaOfertada2, profe3);
        dobo.adicionarProfessor(disciplinaOfertada3, profe1);
        dobo.adicionarProfessor(disciplinaOfertada3, profe2);
        dobo.adicionarProfessor(disciplinaOfertada3, profe3);
        dobo.adicionarProfessor(disciplinaOfertada3, profe4);
        dobo.adicionarProfessor(disciplinaOfertada4, profe2);

        // ADICIONAR DISCIPLINAS NAS FASES
        fbo.adicionarDisciplina(fase1, disciplinaOfertada1);
        fbo.adicionarDisciplina(fase1, disciplinaOfertada2);
        fbo.adicionarDisciplina(fase2, disciplinaOfertada3);
        fbo.adicionarDisciplina(fase2, disciplinaOfertada4);



        // ALUNOS
        AlunoBO abo = new AlunoBO();
        Aluno aluno1 = abo.criar(2002, "Rafael", "rafael@mail.com", bcc);
        Aluno aluno2 = abo.criar(2003, "Daniel", "daniel@mail.com", bcc);
        Aluno aluno3 = abo.criar(2004, "Ana", "ana@mail.com", bcc);


        // MATRICULAS
        MatriculaBO mbo = new MatriculaBO();
        Matricula m1 = mbo.criar(aluno1, disciplinaOfertada1);
        Matricula m2 = mbo.criar(aluno1, disciplinaOfertada4);
        Matricula m3 = mbo.criar(aluno2, disciplinaOfertada3);
        Matricula m4 = mbo.criar(aluno2, disciplinaOfertada4);
        Matricula m5 = mbo.criar(aluno3, disciplinaOfertada2);

        MatriculaService ms = new MatriculaService();

        ms.addMatricula(m1);
        ms.addMatricula(m2);
        ms.addMatricula(m3);
        ms.addMatricula(m4);
        ms.addMatricula(m5);

        // FREQUENCIAS
        FrequenciaBO fqbo = new FrequenciaBO();
        Frequencia f1 = fqbo.criar("01/01/2020", profe1);
        Frequencia f2 = fqbo.criar("02/01/2020", profe2);

        fqbo.adicionarFrequencia(f1, true, m1);
        fqbo.adicionarFrequencia(f2, false, m1);

        // AVALIACOES
        AvaliacaoBO avbo = new AvaliacaoBO();
        Avaliacao a1 = avbo.criar("01/01/2020", profe3);
        Avaliacao a2 = avbo.criar("02/01/2020", profe4);

        avbo.lancarNota(a1, 10, m2);
        avbo.lancarNota(a2, 9, m2);


        // SOUT
        abo.getCursoDoAluno(aluno1);
        System.out.println();
        abo.getMatriculasDoAluno(aluno2, ms);
        System.out.println();
        System.out.println("Coordenador: " + coordenador.getProfessor().getNome());
        cbo.estruturaCurso(bcc);
        System.out.println();
        dobo.mostrarProfessores(disciplinaOfertada3);
        System.out.println();
        fqbo.mostrarFrequencia(f1);
        fqbo.mostrarFrequencia(f2);
        System.out.println();
        avbo.mostrarAvaliacao(a1);
        avbo.mostrarAvaliacao(a2);
    }
}
