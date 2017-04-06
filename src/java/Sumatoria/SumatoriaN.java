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
public class SumatoriaN {
private int n;

     public void asignarValor(int num){
        n=num;
    }
public int obtenerSumatoria(){
        int i;
        int valorSumatoria=0;
        if (n!=0) 
        {    for (i=1;i<=n;i++){
                valorSumatoria=valorSumatoria+(2*i-4);
            }}
        else
        {valorSumatoria=0;
        }
        return valorSumatoria;
    }
}    
