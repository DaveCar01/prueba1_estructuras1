package strc;

import javax.swing.JOptionPane;

public class Alumno extends Persona
{
	private String nombreAlumnos;
	private String materia;
	
	public Alumno() {
		super();
		nombreAlumnos= JOptionPane.showInputDialog("ingrese el nombre del alumno;");
		materia=JOptionPane.showInputDialog("ingrese la materia del Alumno");
		
		// TODO Auto-generated constructor stub
	}
	public Alumno(String nombre, long cedula) {
		super(nombre, cedula);
		// TODO Auto-generated constructor stub
	}
	
	

}
