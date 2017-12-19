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
import modelo.Cliente;
import persistencia.ClienteDAO;


/**
 *
 * @author 20151148060170
 */
@Named
@SessionScoped
public class ClienteBean implements Serializable {

    @Inject
    private Cliente cliente;
    @Inject
    private ClienteDAO clienteDAO;
    private Integer clienteId;
    private DataModel<Cliente> clientes;

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public void carregarClientePelaId() {
        this.cliente = clienteDAO.buscar(clienteId);
    }

    public void gravar() {
        if (this.cliente.getId() == null) {
            clienteDAO.salvar(this.cliente);
        } else {
            clienteDAO.atualizar(this.cliente);
        }
        this.cliente = new Cliente();
    }

    public void atualizar() {
        this.cliente = clientes.getRowData();        
    }

    public void remover(Cliente cliente) {
        clienteDAO.remove(cliente);
        this.cliente = new Cliente();
    }

    public DataModel<Cliente> getClientes() {
        List<Cliente> list = clienteDAO.listar();
        clientes = new ListDataModel<Cliente>(list);
        return clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
