package strc;

import javax.swing.JOptionPane;

public class Profesor extends Persona
{
	private String nombreProfesor;
	private String materia;
	
	public Profesor() {
		super();
		
		nombreProfesor= JOptionPane.showInputDialog("ingreseel nombre del profesor;");
		materia=JOptionPane.showInputDialog("ingrese la materia del profesor");
		// TODO Auto-generated constructor stub
	}
	public Profesor(String nombre, long cedula) {
		super(nombre, cedula);
		// TODO Auto-generated constructor stub
	}
	public Profesor(String nombreProfesor, String materia) {
		super();
		this.nombreProfesor = nombreProfesor;
		this.materia = materia;
	}
	
	
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
