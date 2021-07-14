package com.dio.demo.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Movimentacao {
	@Id
	@EmbeddedId
	private MovimentacaoId id;
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	
	@ManyToOne
	private Ocorrencia ocorrencia;
	@ManyToOne
	private Calendario calendario;
	
	// classe embutida 
	
	@AllArgsConstructor
	@NoArgsConstructor   
	@EqualsAndHashCode 
	@Embeddable
	public class MovimentacaoId implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private long idMovimento;
		private long idUsuario;
	}
	
	
}
