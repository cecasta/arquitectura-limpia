package com.training.java.arq.clean.appgestionreclamos6layersv1.services.administracion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.training.java.arq.clean.appgestionreclamos6layersv1.dto.ProveedorDTO;
import com.training.java.arq.clean.appgestionreclamos6layersv1.mappers.ProveedorMapper;
import com.training.java.arq.clean.appgestionreclamos6layersv1.repository.administracion.ProveedorRepository;
import com.training.java.arq.clean.appgestionreclamos6layersv1.services.exceptions.ServiceException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	private final ProveedorRepository proveedorRepository;
	private final ProveedorMapper proveedorMapper;

	@Override
	public List<ProveedorDTO> findLikeObject(ProveedorDTO proveedorDTO) throws ServiceException {
		try {
			return proveedorMapper.toDTOs(proveedorRepository.findAll());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<ProveedorDTO> findbyId(ProveedorDTO proveedorDTO) throws ServiceException {
		return Optional.empty();
	}

	@Override
	public ProveedorDTO save(ProveedorDTO proveedorDTO) throws ServiceException {
		try {
			return proveedorMapper.toDTO(proveedorRepository.save(proveedorMapper.toEntity(proveedorDTO)));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public ProveedorDTO update(ProveedorDTO proveedorDTO) throws ServiceException {
		return null;
	}

	@Override
	public void delete(ProveedorDTO proveedorDTO) throws ServiceException {
	}

	@Override
	public Optional<ProveedorDTO> findById(String id) throws ServiceException {
		return null;
	}

}
