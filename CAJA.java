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
public class CAJA {
    int ancho;
    int alto;
    int profundo;
    
    CAJA (){}
    CAJA (int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }   
    int volumen(){
        return ancho*alto*profundo;
    }
    void doble (){
        this.ancho = this.ancho *2;
        this.alto = this.alto *2;
        this.profundo = this.profundo *2;
    }
        
    int sumadecaras (){
        int A1,A2,A3;
        A1= alto*ancho;
        A1=A1*2;
        A2 = ancho*profundo;
        A2=A2*2;
        A3 = alto*profundo;
        A3=A3*2;
        
      return A1+A2+A3;
        
        
    }
        
}
