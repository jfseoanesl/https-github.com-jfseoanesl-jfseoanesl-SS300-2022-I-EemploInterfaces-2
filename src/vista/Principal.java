package vista;

import modelo.*;

public class Principal {
    public static void main(String[] args) {
        
        ITrabajador juan = new Empleado();
        imprimirTrabajador(juan);
        
        ITrabajador pedro = new Docente(200);
        imprimirTrabajador(pedro);
        
        Empleado carlos = new Empleado("secretaria");
        imprimirTrabajador(carlos);
        
        
    }
    
    public static void imprimirTrabajador(ITrabajador t){
        System.out.println("Salario: " + t.cSalario());
        System.out.println("Bonificacion: " + t.cBonificacion());
        System.out.println("------------------------------\n");
    }
}
