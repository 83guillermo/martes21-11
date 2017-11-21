
package martes21_11;


public class Persona {
    
    protected String nombre;
    protected int edad;
    // constructor de la clase persona
    public Persona(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
        
    }
    public void mostrarDatos(){
        System.out.println(this.nombre+" "+this.edad);
    }
}
