package com.oh.oracleSP.aplicacion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String raiz(){
        return "Inicio";
    }
}
