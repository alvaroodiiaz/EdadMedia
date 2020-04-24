package Model;

public class Hobbit extends Humano{
	public Hobbit() {
        super();
    }
    
    public Hobbit(String nombre, String apellido, String apodo, int salud) {
        super(nombre, apellido, apodo, salud);
    }
    
    public String toString() {
        return "Hobbit --> "+super.toString();
    }
    
    public void usarEspada(String objetivo) {
        throw new UnsupportedOperationException("Los Hobbits no saben usar espadas");       
    }
}
