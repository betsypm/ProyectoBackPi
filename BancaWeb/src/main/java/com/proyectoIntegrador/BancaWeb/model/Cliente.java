package com.proyectoIntegrador.BancaWeb.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_cliente")

public class Cliente {
	
	@Id
	private int cod_cli;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_tipo_cli")
	private tipoCliente tipocli;
	
	
	private String nom_cli, ape_pat, ape_mat, correo, telefono;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;
	
	

}
