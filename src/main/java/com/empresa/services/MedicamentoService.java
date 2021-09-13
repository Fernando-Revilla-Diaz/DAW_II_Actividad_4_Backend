package com.empresa.services;

import java.util.List;

import com.empresa.entities.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> getMedicamentosList();
	
	public abstract Medicamento addMedicamento(Medicamento medicamento);
}
