
package com.mycompany.unidade15;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT = "uc15-PU";
    
    private static EntityManager em;
    private static EntityManagerFactory fabrica;
    
    //cria a entidade se estiver nula e a retorna
    public static EntityManager getEntityManager(){
        
        
        if(fabrica == null || !fabrica.isOpen())
        fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        
        //cria se em nulo ou se o entity manager foi fechado
        if(em == null || !em.isOpen()){
           em = fabrica.createEntityManager();
        }
        
    return em;
}
    
  public static void closeEM(){
      //fecha o EntityManager e o factory
      if(em.isOpen() || em == null){
       
          em.close();
          fabrica.close();
  }
  } 
    
}
