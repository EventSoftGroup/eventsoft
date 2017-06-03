package es.fdi.eventsoft.presentacion.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administracion/")
public class AdminController {

    private Logger log = LoggerFactory.getLogger(ServiciosController.class);

    @RequestMapping("admin")
    public String home(Model model) {
        model.addAttribute("title", "EventSoft");
        model.addAttribute("pagina", "admin");
        return "admin";
    }
}