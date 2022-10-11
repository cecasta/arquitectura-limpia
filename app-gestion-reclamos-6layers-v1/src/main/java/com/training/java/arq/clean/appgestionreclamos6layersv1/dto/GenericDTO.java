package com.training.java.arq.clean.appgestionreclamos6layersv1.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericDTO implements Serializable{

	private static final long serialVersionUID = 7858782468944240010L;
	
	private Long id;
	private String estado;

}
