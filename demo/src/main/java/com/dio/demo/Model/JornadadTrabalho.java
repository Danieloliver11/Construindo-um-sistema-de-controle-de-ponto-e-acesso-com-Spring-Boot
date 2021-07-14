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
@Builder             // ajuda muito no dto.
public class JornadadTrabalho {
	
	private Long id;
	
	private String descricao;
	
	 

}
