/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import br.com.esf2.modelo.Instrutor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@RequestScoped
public class InstrutorBean {

    private List<Instrutor> instrutores = new ArrayList<Instrutor>();
    
    /**
     * Creates a new instance of InstrutorBean
     */
    public InstrutorBean() {
        Instrutor rafael = new Instrutor();
        rafael.setNome("Rafael");
        rafael.setDataDeNascimento("30/10/1984");
        
        Instrutor pedro = new Instrutor();
        rafael.setNome("Pedro");
        rafael.setDataDeNascimento("10/01/1994");
        
        this.instrutores.add(rafael);
        this.instrutores.add(pedro);
        
               
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }
    
    
}
