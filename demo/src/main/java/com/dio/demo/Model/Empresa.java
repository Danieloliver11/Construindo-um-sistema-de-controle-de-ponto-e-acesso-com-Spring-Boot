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
public class Empresa {
	
	private Long id;
	
	private String descricao;
	
	private String cnpj;
	
	private String endereco;  // poderia ser uma entidade separada, para ter varios endereços
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	private String telefone;
}
