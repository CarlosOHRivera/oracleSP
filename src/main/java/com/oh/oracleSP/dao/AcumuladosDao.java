package com.oh.oracleSP.dao;

import com.oh.oracleSP.modelo.Acumulados;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AcumuladosDao {
    @Autowired
    private EntityManager em;

    public List<Acumulados> setAcumulados() {
        return em.createNamedStoredProcedureQuery("acumularenacumulados").getResultList();
    }
}
