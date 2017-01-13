package strc;

import javax.swing.JOptionPane;

public class Profesor extends Persona
{

private int codigo;
	
	public Profesor() {
		super();
		this.codigo=0;
	}

	
	public Profesor(int cod,String nom) {
		super(nom);
		this.codigo = cod;
	}


	public int getCod() {
		return codigo;
	}

	public void setCod(int cod) {
		this.codigo = cod;
	}
	
	@Override
	public String toString() {
		return "("+ super.toString()+" - codigo prof=" + codigo + ")";
	}
		
	
	
	
}
