/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import br.com.esf2.modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@ApplicationScoped
public class CarroBean {

    /**
     * Creates a new instance of CarroBean
     */
    private List<Carro> carros = new ArrayList<Carro>();
    
    private Carro carro = new Carro();

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
    
    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    public void adicionaCarro(){
        this.carros.add(this.carro);
        this.carro = new Carro();
    }
    
    
    
}
