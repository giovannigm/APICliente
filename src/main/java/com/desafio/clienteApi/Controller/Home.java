package com.desafio.clienteApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.clienteApi.Cliente;
import com.desafio.clienteApi.Service.ClienteService;
import com.desafio.clienteApi.dto.ClienteDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
public class Home {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> getClientes() {
        return clienteService.findAll().stream()
                .map(clienteService::convertToDTO)
                .collect(Collectors.toList());
    }
}
