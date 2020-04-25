package com.cenfotec.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode
@Entity
@Transactional
public class Especie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //sin esto llega a postgre siempre un 0 como id
    private int guid;

	@Column (name = "uuid")
	private String uuid;
    
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "descubierto")
    private String descubierto;
    
    @Column (name = "fecha")
    private LocalDateTime fecha;
    
    @Column (name = "tipo")
    private String tipo;
    
	public String getUUID() {
		return uuid;
	}

	public void setUUID(String puuid) {
		this.uuid = puuid;
	}

    /*
     
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public int getGuid() {
		return guid;
	}

	public void setGuid(int guid) {
		this.guid = guid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(String descubierto) {
		this.descubierto = descubierto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUUID() {
		return uuid;
	}

	public void setUUID(String puuid) {
		this.uuid = puuid;
	}
	
	*/
   
}