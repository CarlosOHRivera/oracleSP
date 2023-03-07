package com.oh.oracleSP.dao;

import com.oh.oracleSP.modelo.Ticket;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDao {
    @Autowired
    private EntityManager em;

    public List<Ticket> getTicketInfo(){
        return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
    }
    @SuppressWarnings("unchecked")
    public List<Ticket> getTicketInfoByCategory(String input) {
        return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcategory", input).getResultList();
    }

    public List<Ticket> getTicketInfoByCategory1(String input) {
        return em.createNamedStoredProcedureQuery("thirdProcedure").setParameter("tcategory", input).getResultList();
    }

    // Se eliminó el .getResultList() y se colocó el .execute
    // aqui le eliminamos el .getResultList() porque no va a traer nada... o al menos podemos llamar el resultado dentro
    // del mismo Stored Procedure para no hacer dos lllamadas al server..
    public void setTicketDiscount(String input) {
        em.createNamedStoredProcedureQuery("discountProcedure").setParameter("tcategory", input).execute();
    }

    public void setTicketDiscountToAll() {
        em.createNamedStoredProcedureQuery("discountToAllProcedure").execute();
    }




}
