
package martes21_11;

import javax.swing.JOptionPane;


public class Martes21_11 {

    public static void main(String[] args) {
        
       Empleado jr = new Empleado("guillermo",34,2000.33,ePuesto.operario);
        jr.mostrarDatos();
        Empleado jr2 = new Empleado("Leonardo",20,25000.4,ePuesto.gerente);
        jr2.mostrarDatos();
        Empleado jr3 = new Empleado("Ana",33,15000.00,ePuesto.administrativo);
        jr3.mostrarDatos();
       
        
    }
    
}
