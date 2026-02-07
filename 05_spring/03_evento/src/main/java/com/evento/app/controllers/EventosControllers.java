package com.evento.app.controllers;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.evento.app.models.Evento;
import com.evento.app.repository.EventosRepository;


@Controller

public class EventosControllers {


    @RequestMapping(value= "/", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");    
        ListCrudRepository<Evento,Long> csr = null;
        Iterable<Evento> eventos = csr.findAll();
        mv.addObject("eventos", eventos);
    return mv;
    }



@RequestMapping ("/cadastroSucesso")
public String cadastroSucesso() {
    return "cadastro-sucesso";
}

    
@RequestMapping ( value = "/editarEvento", method=RequestMethod.GET)
public ModelAndView editarEvento (@PathVariable("idEvento") long idEvento) {
Evento evento = csr.findByIdEvento (idEvento);
ModelAndView mv = new ModelAndView("editar-evento");
mv.addObject("evento", evento);
return mv; 
}

@RequestMapping ( value = "/editarEvento", method=RequestMethod.POST)
public String editarEvento(@Validated Evento evento, BindResult result,
RedirectAttributes attributes) {
csr.save(evento);

return "redirect: /alteracaoSucesso"; 

}


@RequestMapping("/alteracaoSucesso")
public  String alteracaoSucesso(){
return "editar-sucesso"
;
}


@RequestMapping ("/confirmaExclusao/{/idEvento}")
public ModelAndView confirmarExclusao(@PathVariable("idEvento") long idEvento){

    Evento evento = csr.findByIdEvento(idEvento);
    ModelAndView mv = new ModelAndView("excluir-evento");
    mv.addObject("evento", evento);
    return mv; 
}

@RequestMapping ("/excluirEvento")
public String excluirEvento(long idEvento)
Evento evento = csr.findByIdEvento(idEvento);
csr.delete(evento);
return "redirect:/";

    }


