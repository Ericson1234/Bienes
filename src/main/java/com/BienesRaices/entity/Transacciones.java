/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BienesRaices.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author erics
 */
@Entity
@Table (name="transacciones")
public class Transacciones implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private String id;
    private String nomb_factu;
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuarios nombre;
    @ManyToOne
    @JoinColumn(name = "id_metodo")
    private Metodo metodo_pago;
    @ManyToOne
    @JoinColumn(name = "id_propiedades")
    private Propiedades propiedades;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomb_factu() {
        return nomb_factu;
    }

    public void setNomb_factu(String nomb_factu) {
        this.nomb_factu = nomb_factu;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuarios getNombre() {
        return nombre;
    }

    public void setNombre(Usuarios nombre) {
        this.nombre = nombre;
    }

    public Metodo getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(Metodo metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Propiedades getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedades propiedades) {
        this.propiedades = propiedades;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
