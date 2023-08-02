package com.classes.BO;

import com.classes.DTO.Coordenador;
import com.classes.DTO.Curso;
import com.classes.DTO.Professor;

public class CoordenadorBO {

    public Coordenador criar(Professor professor, Curso curso) {
        return new Coordenador(professor, curso);
    }
}
