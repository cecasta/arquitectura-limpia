package com.training.java.arq.clean.appgestionreclamos3layersv1.repository.administracion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;

@Repository
public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long> {

	// JPQL
	
	// Projections
	
	/// Paging $ Sorting

}
