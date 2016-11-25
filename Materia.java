package strc;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Materia 
{
	/*ArrayList<Profesor> profesores= new ArrayList<Profesor>();
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public Materia() {
		super();
		profesores= new ArrayList<Profesor>();
		alumnos= new ArrayList<Alumno>();
		// TODO Auto-generated constructor stub
	}

	public Materia(ArrayList<Profesor> profesores, ArrayList<Alumno> alumnos) {
		super();
		this.profesores = profesores;
		this.alumnos = alumnos;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void borrar()
	{
		Iterator iterador= profesores.iterator();
		
		while(iterador.hasNext())
		{
			
			if(iterador.next() != null)
				iterador.remove();
		}
	}
	public void setDesplegarProfesor()
		{
			Iterator<Profesor> iterador= profesores.iterator();
			Profesor aux;
			
			while(iterador.hasNext())
			{
				aux= iterador.next();
				System.out.println(iterador.next().getNombreProfesor());
				System.out.println(aux.getMateria());
				
			}
		
	}
	
	public void setDesplegarAlumno()
	{
		Iterator<Profesor> iterador= alumnos.iterator();
		Alumno aux;
		
		while(iterador.hasNext())
		{
			aux= iterador.next();
			System.out.println(iterador.next().getNombreProfesor());
			System.out.println(aux.getMateria());
			
		}
	}*/
	public void QuimicaAlumno(){
		String[] Alumnos={"Jorge", "Julio", "Simon"};
		JOptionPane.showMessageDialog(null, Alumnos);
	}
	
	public void fisicaAlumno(){
		String[] Alumnos={"david", "maria", "rosa"};
		JOptionPane.showMessageDialog(null, Alumnos);
	}
	public void calculoAlumno(){
		String[] Alumnos={"Jose", "patricio", "ana"};
		JOptionPane.showMessageDialog(null, Alumnos);
	}
	public void programacionAlumno(){
		String[] Alumnos={"sergio", "andres", "karina"};
		JOptionPane.showMessageDialog(null, Alumnos);
	}
	
	
}
