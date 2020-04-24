package Model;

import Model.PrimerSer;

public class Elfo extends PrimerSer{
	public Elfo() {
        super();
    }
    
    public Elfo(String nombre, String apellido, String apodo, int salud) {
        super(nombre, apellido, apodo, salud);
    }
    
    public String toString() {
        return "Elfo --> " + super.toString();
    }
}
