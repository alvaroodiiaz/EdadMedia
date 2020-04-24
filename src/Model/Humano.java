package Model;

public class Humano extends PrimerSer{
	public Humano() {
        super();
    }
    
    public Humano(String nombre, String apellido, String apodo, int salud) {
        super(nombre, apellido, apodo, salud);
    }

    public String toString() {
        return "Humano --> " + super.toString();
    }
}
