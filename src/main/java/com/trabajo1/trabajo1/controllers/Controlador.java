package com.trabajo1.trabajo1.controllers;

import com.trabajo1.trabajo1.models.Pedido;
import org.springframework.ui.Model;
import com.trabajo1.trabajo1.repositories.Clientes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Controlador {

    @GetMapping("peticion1")
    public String peticion1(Model model){

        String nombres = Clientes.lista.stream()
                .map(cliente -> cliente.getNombre())
                .collect(Collectors.joining(", "));

        model.addAttribute("nombres", nombres);
        return "vista1";
    }

    @GetMapping("peticion2")
    public String peticion2(Model model){

        DoubleSummaryStatistics estadisticas = Clientes.lista.stream()
                        .collect(Collectors.summarizingDouble(cliente -> cliente.getPedidos().size()));

        model.addAttribute("conteo",estadisticas.getCount());
        model.addAttribute("sumatotal",estadisticas.getSum());
        model.addAttribute("promedio",estadisticas.getAverage());
        model.addAttribute("min",estadisticas.getMin());
        model.addAttribute("max",estadisticas.getMax());

        return "vista2";
    }

    @GetMapping("peticion3")
    public String peticion3(Model model){

        List<Pedido> pedidos = Clientes.lista.stream()
                .flatMap(cliente -> cliente.getPedidos().stream())
                .toList();

        List<String> titulos = pedidos.stream()
                .map(Pedido::getTitulo)
                .toList();

        model.addAttribute("pedidos", pedidos);
        model.addAttribute("titulos", titulos);

        return "vista3";
    }

    @GetMapping("peticion4")
    public String peticion4(Model model){

        Boolean sinpedidos = Clientes.lista.stream()
                .anyMatch(cliente -> cliente.getPedidos().isEmpty());

        Boolean masdeuno = Clientes.lista.stream()
                .anyMatch(cliente -> cliente.getPedidos().size() > 1);

        Boolean ningunoconmasdetres  = Clientes.lista.stream()
                .noneMatch(cliente -> cliente.getPedidos().size() > 3);

        model.addAttribute("sinpedidos", sinpedidos);
        model.addAttribute("masdeuno", masdeuno);
        model.addAttribute("ningunoconmasdetres", ningunoconmasdetres);

        return "vista4";
    }

    @GetMapping("peticion5")
    public String peticion5(Model model){

        List<Pedido> pedidos = Clientes.lista.stream()
                .flatMap(cliente -> cliente.getPedidos().stream())
                .toList();

        Pedido mayorvalor = pedidos.stream()
                .max(Comparator.comparingInt(Pedido::getValor))
                .orElse(null);

        model.addAttribute("pedidos", pedidos);
        model.addAttribute("mayorvalor", mayorvalor);

        return "vista5";
    }
}
