/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.modelo;

/**
 *
 * @author Reginaldo
 */
public class Produto {
    
    private String preco;
    private String nome;
    private boolean ie_mostra_preco;

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getIe_mostra_preco() {
        return ie_mostra_preco;
    }

    public void setIe_mostra_preco(boolean ie_motra_preco) {
        this.ie_mostra_preco = ie_motra_preco;
    }
    
    
    
}
