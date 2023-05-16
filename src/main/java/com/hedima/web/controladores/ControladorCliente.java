package com.hedima.web.controladores;

import com.hedima.web.modelo.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorCliente {

    private List<Cliente> clientes = new ArrayList<>();
    @GetMapping("/")
    public String mostrarInicio(){
        return "index";
    }
    @GetMapping("/cliente")
    public String mostrarFormulario(Model modelo){
        modelo.addAttribute("cliente", new Cliente());
        return "formulario";
    }
    @PostMapping("/guardar")
    public String guardarCliente(Cliente cliente){
        clientes.add(cliente);
        return "index";
    }



}
