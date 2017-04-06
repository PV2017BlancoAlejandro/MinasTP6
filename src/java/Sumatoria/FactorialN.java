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
public class FactorialN {
    private int n;
    public void asignarValor(int num){
        n=num;
    }
    public int obtenerFactorial(){
        int valorFactorial = 1;
        int aux=n;
        while(n>=1){
            valorFactorial=valorFactorial*n;
            n=n-1;
            
        }
        n=aux;
        return valorFactorial;
    }
    
}
