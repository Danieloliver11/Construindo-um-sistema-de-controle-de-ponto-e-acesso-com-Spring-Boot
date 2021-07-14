package com.dio.demo.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
@Entity
public class Usuario {
	@Id
	private Long id;
	
	private String nome;
	
	private BigDecimal tolerancia;
	
	private LocalDateTime inicioJornada;
	
	private LocalDateTime finalJornada;
	
	
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	
	@ManyToOne
	private JornadadTrabalho jornadaTrabalho;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private NivelAcesso nivelAcesso;
	
		
	

}
