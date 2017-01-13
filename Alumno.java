package strc;

import javax.swing.JOptionPane;

public class Alumno extends Persona
{
	
	private int codigo;

	public Alumno(int cod,String nombre) {
		super(nombre);
		this.codigo = cod;
	}

	public Alumno() {
		super();
	}

	public int getCod() {
		return codigo;
	}

	public void setCod(int cod) {
		this.codigo = cod;
	}

	
	@Override
	public String toString() {
		return ""+ super.toString()+"- codigo de alumno=" + codigo + "\n";
	}

}
