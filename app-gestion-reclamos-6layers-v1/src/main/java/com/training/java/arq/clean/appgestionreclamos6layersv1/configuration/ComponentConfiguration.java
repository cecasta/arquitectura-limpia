package com.training.java.arq.clean.appgestionreclamos6layersv1.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.training.java.arq.clean.appgestionreclamos6layersv1.entity.ProveedorEntity;
import com.training.java.arq.clean.appgestionreclamos6layersv1.repository.administracion.ProveedorRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class ComponentConfiguration implements CommandLineRunner {

	private final ProveedorRepository proveedorRepository;

	@Override
	public void run(String... args) throws Exception {
		proveedorRepository.deleteAll();
		proveedorRepository.save(ProveedorEntity.builder()
				.id(1L)
				.razonSocial("Pruebas and Tecnologia Group")
				.correo("ccastano@pruebas.com")
				.ruc("112242")
				.estado("1")
				.telefono("3004003232").build());
		proveedorRepository.findAll().forEach((proveedor) -> {
			log.info("{}", proveedor);
		});
		
	}
	
	

}
