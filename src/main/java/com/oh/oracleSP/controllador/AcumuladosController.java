package com.oh.oracleSP.controllador;


import com.oh.oracleSP.dao.AcumuladosDao;
import com.oh.oracleSP.modelo.Acumulados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Esto no funciona con @Controller ..debe ser @RestController
@RestController
public class AcumuladosController {
    @Autowired
    private AcumuladosDao acumuladosDao;
    @GetMapping("/acumulados")
    public List<Acumulados> grabarenAcumulados(){
        return acumuladosDao.setAcumulados();
    }
}
