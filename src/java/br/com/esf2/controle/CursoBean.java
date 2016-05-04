/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import br.com.esf2.modelo.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@SessionScoped
public class CursoBean {
    
    private List<Curso> cursos = new ArrayList<Curso>();
    
    private Curso curso = new Curso();
    
    public void adicionaCurso(){
        this.cursos.add(this.getCurso());
        this.setCurso(new Curso());
    }
    /**
     * Creates a new instance of CursoBean
     */
    public CursoBean() {
        
    }
    
    

    /**
     * @return the cursos
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
   
    
}
