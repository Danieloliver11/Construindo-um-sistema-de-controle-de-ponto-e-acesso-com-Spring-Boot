package com.dio.demo.Model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor   // costrutor sem 
@EqualsAndHashCode
@Builder 
public class Calendario {
	
	private Long id;
	private String descricao;
	private LocalDateTime dataEspecial;
	
	
	
	private TipoData tipoData;
	
	
	

}
