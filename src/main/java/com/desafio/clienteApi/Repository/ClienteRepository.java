package com.desafio.clienteApi.Repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.clienteApi.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // List<Cliente> getAllClientes(); // Este método no es necesario, JpaRepository ya tiene un método findAll()
}
