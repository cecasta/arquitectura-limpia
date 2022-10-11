package com.training.java.arq.clean.appgestionreclamos6layersv1.services.administracion;

import java.util.Optional;

import com.training.java.arq.clean.appgestionreclamos6layersv1.dto.ProveedorDTO;
import com.training.java.arq.clean.appgestionreclamos6layersv1.services.exceptions.ServiceException;
import com.training.java.arq.clean.appgestionreclamos6layersv1.services.generic.GenericService;

public interface ProveedorService extends GenericService<ProveedorDTO> {
	
	Optional<ProveedorDTO> findById(String id) throws ServiceException;
}
