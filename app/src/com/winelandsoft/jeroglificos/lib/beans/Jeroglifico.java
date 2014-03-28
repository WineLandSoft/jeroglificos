package com.winelandsoft.jeroglificos.lib.beans;

import java.io.Serializable;
import java.util.Date;

public class Jeroglifico implements Serializable {
	private static final long serialVersionUID = -8053818983310433709L;
	
	private int idChallenge;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String solucion;
	private String explicacion;
	private int idTipo;
	private Date fechaInsercion;
	private String origen;
	private String origenDescripcion;
	private int puntuacion;
	private boolean activo;
	private boolean like;
	private boolean favorito;
	public int getIdChallenge() {
		return idChallenge;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public String getSolucion() {
		return solucion;
	}
	public String getExplicacion() {
		return explicacion;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public Date getFechaInsercion() {
		return fechaInsercion;
	}
	public String getOrigen() {
		return origen;
	}
	public String getOrigenDescripcion() {
		return origenDescripcion;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public boolean isActivo() {
		return activo;
	}
	public boolean isLike() {
		return like;
	}
	public boolean isFavorito() {
		return favorito;
	}
}
