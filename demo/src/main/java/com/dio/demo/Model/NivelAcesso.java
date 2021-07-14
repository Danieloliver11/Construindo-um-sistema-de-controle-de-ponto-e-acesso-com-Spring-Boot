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
public class NivelAcesso {

	private Long id;
	private String descricao;
}
