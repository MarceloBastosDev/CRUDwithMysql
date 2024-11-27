package com.example.ASPOO.controller;

import com.example.ASPOO.model.Carro;
import com.example.ASPOO.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    // Listar todos os carros
    @GetMapping
    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    // Buscar um carro pelo ID
    @GetMapping("/{id}")
    public Carro buscarPorId(@PathVariable Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    // Adicionar um novo carro
    @PostMapping
    public Carro salvar(@RequestBody Carro carro) {
        return carroRepository.save(carro);
    }

    // Atualizar informações de um carro existente
    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Long id, @RequestBody Carro carroAtualizado) {
        return carroRepository.findById(id).map(carro -> {
            carro.setModelo(carroAtualizado.getModelo());
            carro.setMarca(carroAtualizado.getMarca());
            carro.setAno(carroAtualizado.getAno());
            return carroRepository.save(carro);
        }).orElse(null);
    }

    // Remover um carro pelo ID
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        carroRepository.deleteById(id);
    }
}
