package com.training.java.arq.clean.appgestionreclamos6layersv1.mappers;

import org.mapstruct.Mapper;

import com.training.java.arq.clean.appgestionreclamos6layersv1.dto.ProveedorDTO;
import com.training.java.arq.clean.appgestionreclamos6layersv1.entity.ProveedorEntity;

@Mapper(componentModel = "spring")
public interface ProveedorMapper extends GenericMapper<ProveedorEntity, ProveedorDTO> {

	// para los casos donde los nombres de los atributos no sean igual en el mapper
	//@Mapping(target="employeeId", source="entity.id")
}
