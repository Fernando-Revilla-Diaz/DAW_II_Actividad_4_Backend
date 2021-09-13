package com.empresa.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entities.Medicamento;
import com.empresa.services.MedicamentoService;
import com.empresa.utils.Constants;

@Controller
@RequestMapping("/rest/medicamento")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;

	@ResponseBody
	@GetMapping()
	public ResponseEntity<List<Medicamento>> getMedicamentosList(){
		List<Medicamento> medicamentos = medicamentoService.getMedicamentosList();
		return ResponseEntity.ok(medicamentos);
	}
	
	@ResponseBody
	@PostMapping
	public ResponseEntity<Map<String, Object>> addMedicamento(@RequestBody Medicamento medicamento){
		Map<String, Object> outpUt = new HashMap<>();
		
		try {
			Medicamento medicamentoAdded = medicamentoService.addMedicamento(medicamento);
			if (medicamentoAdded != null) {
				outpUt.put("response", Constants.SUCCESS_REG_MESSAGE);
			} else {
				outpUt.put("response", Constants.ERROR_REG_MESSAGE);
			}
		} catch (Exception e) {
			outpUt.put("response", "Error: " + e.getMessage());
		}
		
		
		return ResponseEntity.ok(outpUt);
	}

}
