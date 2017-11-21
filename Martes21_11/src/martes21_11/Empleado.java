
package martes21_11;


public class Empleado extends Persona {
    protected ePuesto puesto;
    protected double sueldo;
    public Empleado(String nombre, int edad,double sueldo, ePuesto puesto ) {
        super(nombre, edad);
        this.sueldo=sueldo;
        this.puesto=puesto;
        
    }

    /**
     *que hace este metodo ,lo que hace es mostrar 
     * los datos de ambas clase Persona y los
     * de emplea
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this.nombre+" "+this.edad+" "+this.puesto+" "+this.sueldo);
        
    }
   
}
