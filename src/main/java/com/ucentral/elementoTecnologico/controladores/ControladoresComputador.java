package com.ucentral.elementoTecnologico.controladores;

import com.ucentral.elementoTecnologico.dto.ComputadorDto;
import com.ucentral.elementoTecnologico.servicios.ServiciosComputador;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class ControladoresComputador {

    @Autowired
    ServiciosComputador serviciosComputador;

    @GetMapping({  "/inicio"})
    public String consultarTodos(Model model){
        model.addAttribute("lista",this.serviciosComputador.consultarT());
        return "listar_computadores";
    }

    @GetMapping("/compu/nuevo")
    public String mostrarFormulario(Model model){
        ComputadorDto computadorDto = new ComputadorDto();
        model.addAttribute("compu", computadorDto);
        return "form_compu";
    }
    @PostMapping("/crear")
    public String registrarAfiliado(@ModelAttribute("compu") ComputadorDto computadorDto) {
        serviciosComputador.crear(computadorDto);
        return "redirect:/inicio";
    }
}