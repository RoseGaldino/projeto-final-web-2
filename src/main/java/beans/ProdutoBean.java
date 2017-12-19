/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import modelo.Produto;
import persistencia.ProdutoDAO;

/**
 *
 * @author 20151148060170
 */
@Named
@SessionScoped
public class ProdutoBean implements Serializable {

    @Inject
    private Produto produto;
    @Inject
    private ProdutoDAO produtoDAO;
    private Integer produdoId;
    private DataModel<Produto> produtos;

    public Integer getProdutoId() {
        return produdoId;
    }

    public void setProdutoId(Integer produdoId) {
        this.produdoId = produdoId;
    }

    public void carregarProdutoPelaId() {
        this.produto = produtoDAO.buscar(produdoId);
    }

    public void gravar() {
        if (this.produto.getId() == null) {
            produtoDAO.salvar(this.produto);
        } else {
            produtoDAO.atualizar(this.produto);
        }
        this.produto = new Produto();
    }

    public void atualizar() {
        this.produto = produtos.getRowData();        
    }

    public void remover(Produto produto) {
        produtoDAO.remove(produto);
        this.produto = new Produto();
    }

    public DataModel<Produto> getProdutos() {
        List<Produto> list = produtoDAO.listar();
        produtos = new ListDataModel<Produto>(list);
        return produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
