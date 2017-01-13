package strc;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args)
	{
		Profesor profesor[] = new Profesor[8];
		profesor[0] = new Profesor(1,"Ana");
		profesor[1] = new Profesor(2,"Juan");
		profesor[2] = new Profesor(3,"David");
		profesor[3] = new Profesor(4,"Carmen");
		profesor[4] = new Profesor(5,"Jose");
	
		Profesor prof_fis[] = new Profesor[2];
		prof_fis[0]=profesor[2];
		prof_fis[1]=profesor[4];
		
		Profesor prof_quim[] = new Profesor[2];
		prof_quim[0]=profesor[0];
		prof_quim[1]=profesor[3];
		
		Profesor prof_progra[] = new Profesor[2];
		prof_progra[0]=profesor[3];
		prof_progra[1]=profesor[4];
		
		Profesor prof_mat[] = new Profesor[2];
		prof_mat[0]=profesor[1];
		prof_mat[1]=profesor[2];
		
		
		
		Alumno alumno[] = new Alumno[12];
		
		alumno[0]= new Alumno(1, "Carlos");
		alumno[1]= new Alumno(2, "Jose");
		alumno[2]= new Alumno(3, "Manuel");
		alumno[3]= new Alumno(4, "María");
		alumno[4]= new Alumno(5, "Luis");
		alumno[5]= new Alumno(6, "Cristian");
		alumno[6]= new Alumno(7, "Teffa");
		alumno[7]= new Alumno(8, "Erica");
		alumno[8]= new Alumno(9, "Pamela");
		alumno[9]= new Alumno(10, "Juan");
		alumno[10]= new Alumno(11,"Angel");
		alumno[11]= new Alumno(12,"Selena");
		
		
		Alumno alum_fis[] = new Alumno[5];
		alum_fis[0]= alumno[7];
		alum_fis[1]= alumno[8];
		alum_fis[2]= alumno[9];
		alum_fis[3]= alumno[10];
		alum_fis[4]= alumno[11];
		
		
		Alumno alum_quim[] = new Alumno[5];
		alum_quim[0]= alumno[1];
		alum_quim[1]= alumno[3];
		alum_quim[2]= alumno[5];
		alum_quim[3]= alumno[7];
		alum_quim[4]= alumno[9];
		
		Alumno alum_progra[] = new Alumno[5];
		alum_progra[0]= alumno[0];
		alum_progra[1]= alumno[2];
		alum_progra[2]= alumno[4];
		alum_progra[3]= alumno[6];
		alum_progra[4]= alumno[8];
		
		Alumno alum_mat[] = new Alumno[5];
		alum_mat[0]= alumno[11];
		alum_mat[1]= alumno[5];
		alum_mat[2]= alumno[3];
		alum_mat[3]= alumno[7];
		alum_mat[4]= alumno[6];
		
		
				
		
		Materia materias[]= new Materia[4]; 
		
		materias[1] = new Materia("Fisica", prof_fis,alum_fis);
		materias[0] = new Materia("Quimica", prof_quim,alum_quim);
		materias[3] = new Materia("Programación", prof_progra,alum_progra);
		materias[2] = new Materia("Matematica", prof_mat,alum_mat);
		
		
		
		//imprime m
		String nom_pro=JOptionPane.showInputDialog("Ingrese nombre del profesor a buscar");   //Ingresa p
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarProf(nom_pro).compareTo("s")!=0)
			System.out.print(materias[i].buscarProf(nom_pro)+"\n");
		}
		
		
		
		//imprime m-a
		String nom_alum=JOptionPane.showInputDialog("Ingrese nombre del alumno a buscar");  //Ingresa a
		System.out.println("\nMaterias que recibe el/la alumno "+ nom_alum);
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarAlumno(nom_alum).compareTo("s")!=0)
			System.out.print(materias[i].buscarAlumno(nom_alum)+"\n");
			}
		


		//imprime a-p
		String nomp1=JOptionPane.showInputDialog("Ingrese nombre del profesor a buscar");  //Ingresa p-m
		String mater = "";
		
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarProf(nomp1).compareTo("s")!=0)
			mater+=materias[i].buscarProf(nomp1)+" ";
		}
		
		
		String materia = JOptionPane.showInputDialog("El profesor dicta las materias: "+mater+"ingrese la materia a consultar");
		for(int i=0;i<materias.length;i++){
			if(materias[i].getMateria().compareToIgnoreCase(materia)==0){
				System.out.println("\nLos alumnos que reciben "+materia+" con "+nomp1+" son:\n"+Arrays.toString(materias[i].getAlumnos()));
			}
		}
		
		
		
	}

}