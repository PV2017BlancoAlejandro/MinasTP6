/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumatoria;

/**
 *
 * @author Alumno
 */
public class ProductoriaN {
     private double n;
     private double p;

     public void asignarValor(double num){
        n=num;
     }   
     public void asignarValoor(double prod){
         p=prod;
     
    }
public double obtenerProductoria(){
        double i, valorProductoria;
        if (n==0){
        valorProductoria=0;}    
        else
        {valorProductoria=1;
        for (i=1;i<=p;i++){
                valorProductoria=valorProductoria*(Math.pow(n, i));
                     
            }}
 
        return valorProductoria;
    }
}
