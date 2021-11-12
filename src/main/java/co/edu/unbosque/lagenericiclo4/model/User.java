package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	private String usuario;
	@Id
	private String id;
	
	private String password;
	
	public User() {
		
	}

	public User(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
}
