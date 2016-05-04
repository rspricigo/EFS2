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
public class NumeroAleatorioBean {
    private int maximo;
    private int numeroAleatorio;
    
    public String geraNumeroAleatorio(){
        this.numeroAleatorio = (int) (Math.random() * this.getMaximo());
        return "respostanumero";
    }
    /**
     * Creates a new instance of NumeroAleatorioBean
     */
    public NumeroAleatorioBean() {
    }

    /**
     * @return the maximo
     */
    public int getMaximo() {
        return maximo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    /**
     * @return the numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio the numeroAleatorio to set
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
    
    
    
}
