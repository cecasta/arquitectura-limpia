package com.training.java.arq.clean.appgestionreclamos6layersv1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorDTO extends GenericDTO {

	private static final long serialVersionUID = -4193189132355163611L;

	private String razonSocial;
	private String ruc;
	private String correo;

	private String telefono;


	
}
