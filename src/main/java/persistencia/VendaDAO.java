/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Venda;

/**
 *
 * @author 20151148060170
 */
public class VendaDAO extends DAO<Venda,Integer> {
    
    public VendaDAO() {
        super(Venda.class);
    }
    
}
