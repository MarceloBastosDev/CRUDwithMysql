package com.example.ASPOO.controller;

import com.example.ASPOO.model.Carro;
import com.example.ASPOO.model.Cliente;
import com.example.ASPOO.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Atualizar informações de um carro existente
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setNome(clienteAtualizado.getNome());
            cliente.setEmail(clienteAtualizado.getEmail());
            cliente.setIdade(clienteAtualizado.getIdade());
            return clienteRepository.save(cliente);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return "Cliente deletado com sucesso.";
        } else {
            return "Cliente não encontrado.";
        }
    }

}
