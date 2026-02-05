package com.evento.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evento.app.models.Evento;
import com.evento.app.repository.EventosRepository;


@Controller

public class EventosControllers {


    @RequestMapping(value= "/", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");    
        Iterable<Evento> eventos = csr.findAll();
        mv.addObject("eventos", eventos);
    return mv;
    }



    }

@
RequestMapping (value= "/cadastroEvento", method = =RequestMethod.GET)
