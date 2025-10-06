
package com.mycompany.unidade15.UI.funcionarios;

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

public class turnosDAO {
    
    
    public void salvar (turnos turno) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(turno);
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
    
      public List<turnos> turnos (String dados){
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<turnos> lista = null;
        
        try{
            
            String TextoQuery = "select f from turnos f where (:dados is null or f.nome like :dados)";
            Query consulta = em.createQuery(TextoQuery);
            
            consulta.setParameter("dados", dados.isEmpty()? null : "%" + dados + "%");
            
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
        