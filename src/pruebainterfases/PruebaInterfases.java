/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterfases;

/**
 *
 * @author FAMGOMO
 */
public class PruebaInterfases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PorPagar arreglo[]=new PorPagar[4];
        arreglo[0]=new Factura ("01234","asiento",2,375.00);
        arreglo[1]=new Factura ("56789","llanta",4,79.95);
        arreglo[2]=new EmpleadoAsalariado("Carlos","Pano","1234-56789",800);
        arreglo[3]=new EmpleadoAsalariado("Fernanda","Margarita","0000-0010",100);
        
        for(PorPagar x:arreglo){
            System.out.printf("%n%s %n%s: $%,.2f%n",x.toString(),"cantidad por pagar"
            ,x.obtenerMontoPago());
        }
    }
    
}
