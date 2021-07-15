package com.dio.demo.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor   // costrutor sem 
@EqualsAndHashCode
@Builder 
@Entity
public class Calendario {
	@Id
	private Long id;
	private String descricao;
	private LocalDateTime dataEspecial;
	
	
	@ManyToOne
	private TipoData tipoData;
	
	
	

}
