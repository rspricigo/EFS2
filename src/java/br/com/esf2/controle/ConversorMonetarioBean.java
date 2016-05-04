/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@SessionScoped
public class ConversorMonetarioBean {

    
    private String de;
    private String para;
    private Double valor;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    private Double resultado;
    
    private Map<String, Double> taxas = new LinkedHashMap<String, Double>();
    
    public ConversorMonetarioBean() {
        this.taxas.put("Real", 1.00);
        this.taxas.put("Euro", 2.33);
        this.taxas.put("Peso argentino", 0.42);
        this.taxas.put("Dolar americano", 1.84);
        
    }

    public Map<String, Double> getTaxas() {
        return taxas;
    }
    
    
    
    public void converte(){
        this.resultado = this.valor * this.taxas.get(this.de)/ this.taxas.get(this.para);
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    
    
    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    
    
    
    
    
}
