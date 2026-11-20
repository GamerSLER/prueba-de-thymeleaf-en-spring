package com.gamersler.pruebaspringthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Mi primera web con Thymeleaf");
        model.addAttribute("mensaje", "¡Funcionando en Spring Boot!");
        return "index";
    }
}
