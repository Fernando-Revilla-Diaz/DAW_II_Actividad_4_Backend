package com.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entities.Medicamento;
import com.empresa.repositories.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@Override
	public List<Medicamento> getMedicamentosList() {
		return medicamentoRepository.findAll();
	}

	@Override
	public Medicamento addMedicamento(Medicamento medicamento) {
		return medicamentoRepository.save(medicamento);
	}

}
