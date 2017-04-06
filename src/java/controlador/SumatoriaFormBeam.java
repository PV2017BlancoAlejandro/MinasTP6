/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Sumatoria.SumatoriaN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class SumatoriaFormBeam {
    private int n;
  
    public SumatoriaFormBeam() {
    }
    public int calcularSumatoria(){
    SumatoriaN unaSumatoria= new SumatoriaN();
    unaSumatoria.asignarValor(getN());
    return unaSumatoria.obtenerSumatoria();
}

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}