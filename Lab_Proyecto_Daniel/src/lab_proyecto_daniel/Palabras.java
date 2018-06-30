/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto_daniel;

/**
 *
 * @author X
 */
public class Palabras {
    private String palabra;
    private int frecuencia;
    private int linea;

    public Palabras() {
    }

    public Palabras(String palabra, int frecuencia) {
        this.palabra = palabra;
        this.frecuencia = frecuencia;
    }

    public Palabras(String palabra, int frecuencia, int linea) {
        this.palabra = palabra;
        this.frecuencia = frecuencia;
        this.linea = linea;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return palabra + ": " + frecuencia+"\n";
    }
    
}
