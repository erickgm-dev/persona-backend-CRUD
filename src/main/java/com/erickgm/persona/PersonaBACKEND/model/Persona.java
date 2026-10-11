package com.erickgm.persona.PersonaBACKEND.model;

import jakarta.persistence.*;

@Entity                                                 //@Entity Le dice a JPA que esta clase sera una tabla en la bd
@Table (name = "persona")                               //@Table Le dice que nombre tendra la tabla
public class Persona {

    @Id                                                 //@Id es la llave primaria de la tabla (nuestro indentificador)
    @GeneratedValue (strategy = GenerationType.AUTO)    //@GeneratedValue Genera automáticamente el id de cada persona
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    //El “Many” es la clase actual (Persona) y el “One” es el tipo del atributo (Pais o Estado).
    @ManyToOne                                          //Muchas Peronas a un pais
    @JoinColumn (name = "id_pais")                      //Define una columna llamada id_pais en la tabla persona, y ahí se guarda el id del pais de cada persona.
    private Pais pais;

    @ManyToOne                                          //Muchas personas a un Estado
    @JoinColumn (name = "id_estado")                    //Define una columna llamada id_estado en la tabla persona, y ahí se guarda el id del estado de cada persona.
    private Estado estado;

    //Constructor
    public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
