
package com.mycompany.unidade15.UI.produto;


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


public class produtosDAO {
    public void salvar (produto prod) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(prod);
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
               
      public List<produto> produtor (){
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<produto> lista = null;
        
        try{
            
            String TextoQuery = "select f from produto f ";
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
