package br.com.senac.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EstudanteDTO {
	
	private Long id;

	@NotNull(message="O campo nome é requerido.")
	private String nome;
	
	@NotNull(message="O campo e-mail é requerido.")
	private String email;
	
	private LocalDate dataNascimento;

}
