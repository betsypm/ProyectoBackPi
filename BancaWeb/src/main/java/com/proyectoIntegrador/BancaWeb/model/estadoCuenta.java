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
@Table(name="tb_estado_cuenta")
public class estadoCuenta {
	
	@Id
	private int id_estado_cuenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_cli")
	private Cliente cliente;
	
	private double saldo;

}
