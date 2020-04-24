package Model;

public class Orco extends Elfo{
	public Orco() {
		super();
	}
	
	public Orco(String nombre, String apellido, String apodo, int salud) {
		super(nombre, apellido, apodo, salud);
	}
	
	public String toString() {
		return "Orco --> "+super.toString();
	}
}
