package com.hedima.web.controladores;

import com.hedima.web.modelo.Cliente;
import com.hedima.web.modelo.Pedido;
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
    }@GetMapping("/pedido")
    public String mostrarFormularioPedido(Model modelo){
        modelo.addAttribute("pedido", new Pedido());
        return "fpedido";
    }
    @PostMapping("/guardar")
    public String guardarCliente(Cliente cliente){
        clientes.add(cliente);
        return "index";
    }@PostMapping("/guardarpedido")
    public String guardarPedido(Pedido pedido){
        System.out.println(pedido.toString());
        return "index";
    }



}
