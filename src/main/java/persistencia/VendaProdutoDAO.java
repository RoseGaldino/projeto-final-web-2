/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author 20151148060170
 */
import modelo.VendaProduto;

public class VendaProdutoDAO extends DAO<VendaProduto,Integer> {
    
    public VendaProdutoDAO() {
        super(VendaProduto.class);
    }
    
}
