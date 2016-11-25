package strc;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Persona
{
	private String nombre;
	private long cedula;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, long cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}
	public void setpersona(){
		String linea= JOptionPane.showInputDialog("Ingrese el nombre y la cedula separado por una coma");
		StringTokenizer tokens = new StringTokenizer(linea, ",");
		this.nombre= tokens.nextToken();
		this.cedula=Long.parseLong(tokens.nextToken());
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	
	
	public void setPersona(){
		String linea= JOptionPane.showInputDialog("Ingrese el nombre y la cedula separado por una coma");
		StringTokenizer tokens = new StringTokenizer(linea, ",");
		this.nombre= tokens.nextToken();
		this.cedula=Long.parseLong(tokens.nextToken());
		
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
	
}
