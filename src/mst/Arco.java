/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

/**
 *
 * @author FranciscoHdez
 */
public class Arco {
    int nodoincial;
    int nodofinal;
    int peso;
    int x1, y1, x2, y2;

    public Arco(int nodoincial, int nodofinal, int peso, int x1, int y1, int x2, int y2) {
        this.nodoincial = nodoincial;
        this.nodofinal = nodofinal;
        this.peso = peso;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getNodoincial() {
        return nodoincial;
    }

    public void setNodoincial(int nodoincial) {
        this.nodoincial = nodoincial;
    }

    public int getNodofinal() {
        return nodofinal;
    }

    public void setNodofinal(int nodofinal) {
        this.nodofinal = nodofinal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
