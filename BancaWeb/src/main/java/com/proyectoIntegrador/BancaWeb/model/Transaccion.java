package com.proyectoIntegrador.BancaWeb.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="tb_transaccion")

public class Transaccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tran;
	
	private String des_tran;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_tran")
	private Transaccion transaccion;
	
	private double monto_tran;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_tran;
	

}
