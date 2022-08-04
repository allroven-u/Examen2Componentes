package com.cenfotec.ac.cr.examen2componentes.controller;
import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;
import com.cenfotec.ac.cr.examen2componentes.services.futbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class futbolistaController {

    @Autowired
    futbolistaService jugadorService;


    @RequestMapping("/")
    private String homePage(Model model){
        return "index";
    }

    @RequestMapping(value = "/registrar")
    private String getRegistrarPage(Model model){
        futbolista nuevo = new futbolista();
        model.addAttribute("nuevo",nuevo);
        return "registrar";
    }

    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    private String postRegistrarPage(Model model, futbolista nuevo, BindingResult result){
    nuevo.setIndiceMasa(30.00);
    jugadorService.registrarFutbolista(nuevo);
        return "exito";
    }

    @RequestMapping(value = "/listar")
    private String getListPersonas(Model model){
        model.addAttribute("lista", jugadorService.listarFutbolistas());
        return "lista";
    }

    @RequestMapping(value = "/listarPor/{id}")
    private String getListJugador(Model model, @PathVariable long id){
        model.addAttribute("listaPor", jugadorService.get(id));
        return "listaPor";
    }

}
