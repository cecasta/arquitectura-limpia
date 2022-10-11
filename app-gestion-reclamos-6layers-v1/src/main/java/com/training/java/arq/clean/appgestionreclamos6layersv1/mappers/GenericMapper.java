package com.training.java.arq.clean.appgestionreclamos6layersv1.mappers;

import java.util.List;

public interface GenericMapper<E, D> {
	
	E toEntity(D d);
	
	D toDTO(E e);
	
	List<E> toEntities(List<D> listD);
	
	List<D> toDTOs(List<E> listE);
}
