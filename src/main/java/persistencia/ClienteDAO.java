/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import modelo.Cliente;

/**
 *
 * @author 20151148060170
 */
public class ClienteDAO extends DAO<Cliente, Integer> implements Serializable {

    public ClienteDAO() {
        super(Cliente.class);
    }

}
