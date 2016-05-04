/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.modelo;

import java.util.Date;

/**
 *
 * @author Reginaldo
 */
public class Funcionario {

    private Double salario;
    private Integer codigo;
    private Date aniversario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
    
    
    
}
