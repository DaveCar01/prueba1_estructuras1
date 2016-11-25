package strc;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
//		Persona persona =new Persona();
		
		String salida="";
		int opcion=0, i=0;


		

		
		
		do{
		Object[] nombreBotones= {"Alumnos en una materia","Materias de Profesor","Materias por alumno"};
			

		int opciones=JOptionPane.showOptionDialog(null, "Reportes a imprimir","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,nombreBotones, nombreBotones[0]);
		System.out.println(opciones);
		
		switch(opciones){
		case 0: {
			Object[] nombreMaterias= {"Quimica","Fisica","Programacion", "Calculo"};
			

		int opM=JOptionPane.showOptionDialog(null, "Reportes a imprimir","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,nombreMaterias, nombreMaterias[0]);

		
		
		switch(opM){
		
		case 0: {
			Materia quimica= new Materia();
			quimica.QuimicaAlumno();
			
			break;
			}
		case 1: {
			Materia fisica= new Materia();
			fisica.fisicaAlumno();
			
			break;
			}
		case 2: {
			Materia calculo= new Materia();
			calculo.calculoAlumno();
			
			break;
			}
		case 3: {
			Materia programacion= new Materia();
			programacion.programacionAlumno();
			
			break;
			}
		}
		
		
		
			
		
		
		}
		case 1:{
			 
			
			break;
		}
		case 2:{
			
			break;
			
		}
		}
		i++;
		if(i==10)
			break;
		opcion=JOptionPane.showConfirmDialog(null, "Imprimir otro reporte", "Reportes", JOptionPane.YES_NO_OPTION);
		}
		while(opcion== JOptionPane.YES_NO_OPTION);

	}

}