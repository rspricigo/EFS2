/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import br.com.esf2.modelo.Funcionario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Reginaldo
 */
@ManagedBean
@RequestScoped
public class FuncionarioBean {

    /**
     * Creates a new instance of FuncionarioBean
     */
    
    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
    public FuncionarioBean() {
    }
    
}
