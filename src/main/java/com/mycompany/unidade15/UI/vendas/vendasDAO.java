
package com.mycompany.unidade15.UI.vendas;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.mycompany.unidade15.JPAUtil;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;


public class vendasDAO {
    public void salvar (vendas vender) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(vender);
        em.getTransaction().commit();
        System.out.println("sucesso");
        
        }catch(Exception e){
            System.out.println("erro: " + e.getMessage());
            em.getTransaction().rollback();
            throw e;
        }
        
        finally{
            JPAUtil.closeEM();
        }
    }
               
      public List<vendas> listar (){
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<vendas> lista = null;
        
        try{
            
            String TextoQuery = "select f from vendas f ";
            Query consulta = em.createQuery(TextoQuery);
            
            lista = consulta.getResultList();
            
            
        }catch(Exception e){
            
        System.out.println("erro: " + e.getMessage());
        
    }
        finally{
            JPAUtil.closeEM();
        }
        
        return lista;
        
    }
}
