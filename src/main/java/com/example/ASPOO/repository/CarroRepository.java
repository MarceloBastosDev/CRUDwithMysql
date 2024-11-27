package com.example.ASPOO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ASPOO.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
