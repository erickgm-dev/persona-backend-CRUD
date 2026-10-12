package com.erickgm.persona.PersonaBACKEND.model;


import jakarta.persistence.*;

@Entity
@Table
public class Estado {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne                                          //Muchos Estados a un pais
    @JoinColumn (name = "id_pais")                      //Define una columna llamada id_pais en la tabla estado, y ahí se guarda el id del pais de cada estado.
    private Pais pais;

    private String nombre;

    //Constructor
    public Estado(Pais pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    //Getters y Setters
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
