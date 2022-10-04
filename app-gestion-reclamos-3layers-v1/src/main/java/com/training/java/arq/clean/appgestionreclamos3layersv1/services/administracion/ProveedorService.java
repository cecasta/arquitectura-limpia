package com.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion;

import java.util.Optional;

import com.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;
import com.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;
import com.training.java.arq.clean.appgestionreclamos3layersv1.services.generic.GenericService;

public interface ProveedorService extends GenericService<ProveedorEntity> {
	
	Optional<ProveedorEntity> findById(String id) throws ServiceException;
}
