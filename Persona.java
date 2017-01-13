package strc;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public abstract class Persona
{
	
	private String nombre;

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	@Override
	public String toString() {
		return " " + nombre + " ";
	}
	
	
	
}
