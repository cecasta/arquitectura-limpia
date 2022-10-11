package com.training.java.arq.clean.appgestionreclamos6layersv1.controllers.administracion;

import static com.training.java.arq.clean.appgestionreclamos6layersv1.controllers.commons.APIConstant.API_PROVEEDOR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.java.arq.clean.appgestionreclamos6layersv1.controllers.generic.GenericController;
import com.training.java.arq.clean.appgestionreclamos6layersv1.dto.ProveedorDTO;
import com.training.java.arq.clean.appgestionreclamos6layersv1.services.administracion.ProveedorService;
import com.training.java.arq.clean.appgestionreclamos6layersv1.services.exceptions.ServiceException;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController {

	private final ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<?> findLikeObject() throws ServiceException {
		return ResponseEntity.ok(proveedorService.findLikeObject(null));
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProveedorDTO proveedorDTO) throws ServiceException {
		return ResponseEntity.status(HttpStatus.CREATED).body(proveedorService.save(proveedorDTO));
	}
}
