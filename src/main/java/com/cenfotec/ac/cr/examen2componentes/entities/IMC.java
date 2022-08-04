package com.cenfotec.ac.cr.examen2componentes.entities;

import javax.persistence.*;

@Entity
public class IMC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Porcentaje;
    private String Fecha;

    @ManyToOne
    @JoinColumn(nullable=false)
    private futbolista jugador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        Porcentaje = porcentaje;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public futbolista getJugador() {
        return jugador;
    }

    public void setJugador(futbolista jugador) {
        this.jugador = jugador;
    }
}
