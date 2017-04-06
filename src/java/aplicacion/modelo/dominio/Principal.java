/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import Sumatoria.FactorialN;
import Sumatoria.ProductoriaN;
import Sumatoria.SumatoriaN;

/**
 *
 * @author Alumno
 */
public class Principal {
    public static void main(String[]arg){
        mostrarSumatoria();
        mostrarProductoria();
    }
    public static void mostrarSumatoria(){
        SumatoriaN sum=new SumatoriaN();
        int resultado=sum.obtenerSumatoria();
        System.out.println("La sumatoria es: "+resultado);
    }
    
    public static void mostrarProductoria(){
        ProductoriaN prod=new ProductoriaN();
        double resultado=prod.obtenerProductoria();
        System.out.println("La productoria es: "+resultado);}
    
     public static void mostrarFactorial(){
        FactorialN fac=new FactorialN();
        int resultado=fac.obtenerFactorial();
        System.out.println("El factorial es: "+resultado);
    }
}