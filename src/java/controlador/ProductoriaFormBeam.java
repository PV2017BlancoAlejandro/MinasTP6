/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Sumatoria.ProductoriaN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class ProductoriaFormBeam {
    private int n,p;
    /**
     * Creates a new instance of ProductoriaFormBeam
     */
    public ProductoriaFormBeam() {
    }
    public double calcularProductoria(){
    ProductoriaN unaProductoria= new ProductoriaN();
    unaProductoria.asignarValor(getN());
    unaProductoria.asignarValoor(getP());
    return unaProductoria.obtenerProductoria();
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

    /**
     * @return the p
     */
    public int getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(int p) {
        this.p = p;
    }
}
