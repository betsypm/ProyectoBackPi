package com.proyectoIntegrador.BancaWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_tipo_cuenta")
public class tipoCuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_cuenta")
	private int id;
	
	@Column(name="des_cuenta")
	private int descripcion;
	
	

}
