package Model;
public class PrimerSer {
	
	protected String nombre;
    
    protected String apellido;
    
    protected String apodo;
    
    protected int salud;
    
    public PrimerSer() {
        this.nombre = "";
        this.apellido = "";
        this.apodo = "";
        this.salud = 0;
    }
    
    public PrimerSer(String nombre, String apellido, String apodo, int salud) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }  
    
    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    public boolean equals(Object obj) {
        boolean iguales = true;
        PrimerSer otroSer = (PrimerSer) obj;
        if(nombre.equals(otroSer.nombre) && apellido.equals(otroSer.apellido) && apodo.equals(otroSer.apodo) && salud==otroSer.salud) {
           iguales = true;
        } else {
            iguales = false;
        }
        
        return iguales;     
    }
    
    public String toString() {
    	return "Nombre = " + nombre + " Apellido= " + apellido + " Apodo= "
                + apodo+" Salud= "+salud;
    }
}
