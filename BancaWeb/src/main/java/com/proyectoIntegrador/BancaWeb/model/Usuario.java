package com.proyectoIntegrador.BancaWeb.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	private int cod_usu;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cod_cli")
	private Cliente cliente;
	
	private String nom_usu;
	
	private String clave_usu;

}
