/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.Usuario;

/**
 *
 * @author 20151148060170
 */
public class UsuarioDAO extends DAO<Usuario, Integer> implements Serializable {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public boolean existeUsuario(Usuario usuario) {
        String jpql = "select u from Usuario u where u.email = :pemail and u.senha = :psenha";
        Query query = getEntityManager().createQuery(jpql, Usuario.class);
        query.setParameter("pemail", usuario.getEmail());
        query.setParameter("psenha", usuario.getSenha());
        try {
            query.getSingleResult();
            return true;
        } catch (NoResultException exp) {
            return false;
        }
    }

}
