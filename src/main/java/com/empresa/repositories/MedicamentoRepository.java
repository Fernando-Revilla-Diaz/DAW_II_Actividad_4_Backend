package com.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entities.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{

}
