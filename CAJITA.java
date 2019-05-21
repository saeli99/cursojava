/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author PC09-LAB02
 */
public class CAJITA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CAJA C1 = new CAJA (3,2,6);
        int resultado = C1.volumen();
        System.out.println ("El volumen de la caja es "+": " + resultado);
        C1.doble ();
        resultado = C1.volumen();
        System.out.println ("El doble de la caja es "+": " + resultado);
        C1.sumadecaras();
        resultado = C1.sumadecaras();
        System.out.println("La suma de las caras de la caja es "+ ": " + resultado);
    }
    
    
}
