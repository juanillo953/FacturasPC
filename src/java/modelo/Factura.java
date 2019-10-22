/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno_2DAW
 */
public class Factura implements Comparable {
    private String fecha;
    private String encargado;
    private String solicitante;
    private double precio;
    private String tipo;
    private String descripcion;

    public Factura(String fecha, String encargado, String solicitante, double precio, String tipo, String descripcion) {
        this.fecha = fecha;
        this.encargado = encargado;
        this.solicitante = solicitante;
        this.precio = precio;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Object t) {
        Date fechaComparar=null;
        Date fechaComparar2=null;
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        Factura factura= (Factura) t;
        try {
            fechaComparar= formateador.parse(factura.getFecha());
            fechaComparar2= formateador.parse(this.fecha);
            
        } catch (ParseException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaComparar2.compareTo(fechaComparar) ;
        
    }
    
}
