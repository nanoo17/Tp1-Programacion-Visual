package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Inmueble {
private int codigo, descripcion;
private String Oficina, Vivienda, Edificio, Direccion, estado;
private double precio;

public Inmueble() {
	
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public int getDescripcion() {
	return descripcion;
}

public void setDescripcion(int descripcion) {
	this.descripcion = descripcion;
}

public String getOficina() {
	return Oficina;
}

public void setOficina(String oficina) {
	Oficina = oficina;
}

public String getVivienda() {
	return Vivienda;
}

public void setVivienda(String vivienda) {
	Vivienda = vivienda;
}

public String getEdificio() {
	return Edificio;
}

public void setEdificio(String edificio) {
	Edificio = edificio;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

}
