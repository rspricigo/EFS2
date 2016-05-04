/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@RequestScoped
public class TextoBean {

    /**
     * Creates a new instance of TextoBean
     */
    private String texto;

    public TextoBean() {
    }
    
    public String transformaEmCaixaAlta(){
        this.setTexto(this.getTexto().toUpperCase());
        return "resposta";
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
