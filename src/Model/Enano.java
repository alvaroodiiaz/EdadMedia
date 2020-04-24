package Model;

public class Enano extends PrimerSer{
	public Enano() {
		super();
	}
	
	public Enano(String nombre, String apellido, String apodo, int salud) {
		super(nombre, apellido, apodo, salud);
	}
	
	public void usarHacha(String objetivo) {
		System.out.println(objetivo);
	}
	
	public void crearArmadura(String objetivo) {
		System.out.println(objetivo);
	}
	
	public String toString() {
		return "Enano --> "+super.toString();
	}
}
