package com.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;
import com.training.java.arq.clean.appgestionreclamos3layersv1.repository.administracion.ProveedorRepository;
import com.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	private final  ProveedorRepository proveedorRepository;
	
	// Para no usar esto se inyecta con lombok el @RequiredArgsConstructor
	/*public ProveedorServiceImpl(final ProveedorRepository proveedorRepository) {
		this.proveedorRepository = proveedorRepository;
	}*/

	@Override
	public List<ProveedorEntity> findLikeObject(ProveedorEntity t) throws ServiceException {
		try {
			return proveedorRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<ProveedorEntity> findbyId(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProveedorEntity save(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProveedorEntity update(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<ProveedorEntity> findById(String id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
