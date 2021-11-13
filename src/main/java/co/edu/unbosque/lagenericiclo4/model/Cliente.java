package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    private String cedula;
    private String direccion;
    private String correo;
    private String nombre;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String cedula, String direccion, String correo, String nombre, String telefono) {
		this.cedula = cedula;
		this.direccion = direccion;
		this.correo = correo;
		this.nombre = nombre;
		this.telefono = telefono;
	}

    public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", direccion=" + direccion + ", correo=" + correo + ", nombre=" + nombre
				+ ", telefono=" + telefono + "]";
	}
}