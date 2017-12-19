/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20151148060170
 */
@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @ManyToOne
    private Cliente cliente;
    
  
    
    @OneToMany
    private List<VendaProduto> vendaprodutos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    public List<VendaProduto> getVendaproduto() {
        return vendaprodutos;
    }

    public void setVendaproduto(List<VendaProduto> vendaprodutos) {
        this.vendaprodutos = vendaprodutos;
    }
    
    private SituacaoVenda situacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public SituacaoVenda getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoVenda situacao) {
        this.situacao = situacao;
    }
    
    
}
