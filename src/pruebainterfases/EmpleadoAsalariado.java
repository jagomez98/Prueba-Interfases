/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterfases;

/**
 *
 * @author link_
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre,
     String apellidos, String nSS,double salarioSemanal) {
        super(nombre, apellidos, nSS);
        this.salarioSemanal=salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public String toString(){
        return String.format
        ("empleado asalariado: %s%n%s: $%,.2f",
          super.toString(),"salario semanal",
          this.salarioSemanal);
    }

    @Override
    public double obtenerMontoPago() {
        return this.salarioSemanal; //To change body of generated methods, choose Tools | Templates.
    }
    
}
