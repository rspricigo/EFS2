/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esf2.controle;

import br.com.esf2.modelo.Produto;
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
public class ProdutoBean {
    
    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<Produto>();
    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {
    }
    
    public void adicionaProduto(){
        this.produtos.add(this.produto);
        this.setProduto(new Produto());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
