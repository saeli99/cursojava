/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaciones;

/**
 *
 * @author PC09-LAB02
 */
public class ESTACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = 12;
        String estacion;
        if (mes ==1 || mes ==2 || mes ==12)
            estacion = "invierno";
        else if (mes == 3 || mes == 4)
            estacion = "primavera";
        else if (mes == 6|| mes ==7||mes ==8)
            estacion = "verano";
        else if (mes ==9||mes==10||mes ==11)
            estacion = "otoño";
        else
            estacion = "mes incorrecto";
        System.out.println(estacion);
        
        
        
        
        // TODO code application logic here
    }
    
}
