package com.sesion1.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 155018814880308143L;
	private String usuario;
	private String password;
	private String nombre;
	private boolean estado;
	
	public String execute(){
		// Prueba GIT
		String ir = ERROR;
		if (getUsuario().equals("acalo") && getPassword().equals("123")){
			setNombre("Antonio Calo EXECUTE");;
			ir = SUCCESS;
		}
		return ir;
	}
	
	public String alta(){
		String ir = ERROR;
		if (getUsuario().equals("acalo") && getPassword().equals("123")){
			if (isEstado()){
				setNombre("Antonio Calo ALTA TRUE");
			}else{
				setNombre("Antonio Calo ALTA FALSE");
			}
			
			addActionMessage("Bienvenido Usuario");
			addActionMessage("Login OK");
			ir = SUCCESS;
		}else if (getUsuario().equals("") && getPassword().equals("")){
			addActionError("Falta ingresar datos");
		}else{
			addActionError("Usuario o Password Incorrecto");
		}
		return ir;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
