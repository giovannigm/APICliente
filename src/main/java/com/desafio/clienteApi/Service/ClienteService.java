package com.desafio.clienteApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.clienteApi.Cliente;
import com.desafio.clienteApi.Repository.ClienteRepository;
import com.desafio.clienteApi.dto.ClienteDTO;

import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public ClienteDTO convertToDTO(Cliente cliente) {
        int edad = calcularEdad(cliente.getFechaNacimiento());
        return new ClienteDTO(cliente.getNombre(), cliente.getApellido(), edad);
    }
    
}
