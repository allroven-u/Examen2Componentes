package com.cenfotec.ac.cr.examen2componentes.entities;



import javax.persistence.*;
import java.util.Set;


@Entity
public class futbolista {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String posicion;
    private String Genero;
    private Double estatura;
    private Double peso;
    private Double indiceMasa;
    private String provincia;
    private String canton;
    private String distrito;
    private String direccion;
    private String telefono;
    private String email;

    @OneToMany(fetch= FetchType.LAZY, mappedBy="jugador")
    private Set<IMC> registrosIMC;


    public futbolista() {
    }

    public futbolista(Long id, String nombre, String apellido1, String apellido2, String posicion, String genero, Double estatura, Double peso, Double indiceMasa, String provincia, String canton, String distrito, String direccion, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.posicion = posicion;
        Genero = genero;
        this.estatura = estatura;
        this.peso = peso;
        this.indiceMasa = indiceMasa;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getIndiceMasa() {
        return indiceMasa;
    }

    public void setIndiceMasa(Double indiceMasa) {
        this.indiceMasa = indiceMasa;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<IMC> getRegistrosIMC() {
        return registrosIMC;
    }

    public void setRegistrosIMC(Set<IMC> registrosIMC) {
        this.registrosIMC = registrosIMC;
    }
}
