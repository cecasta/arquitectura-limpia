package com.training.java.arq.clean.appgestionreclamos3layersv1.controllers.administracion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.java.arq.clean.appgestionreclamos3layersv1.controllers.generic.GenericController;
import com.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;
import com.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion.ProveedorService;
import com.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;

import lombok.RequiredArgsConstructor;

import static com.training.java.arq.clean.appgestionreclamos3layersv1.controllers.commons.APIConstant.API_PROVEEDOR;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController {

	private final ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<?> findLikeObject(ProveedorEntity t) throws ServiceException {
		return ResponseEntity.ok(proveedorService.findLikeObject(null));
	}
}
