package com.dio.demo.Model;

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
public class Ocorrencia {
	
	private Long id;
	private String nome;
	private String descricao;
	
	

}
