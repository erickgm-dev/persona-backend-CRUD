package com.erickgm.persona.PersonaBACKEND.model;
import jakarta.persistence.*;

@Entity                                               //@Entity le dice a JPA que esta clase sera una tabla en la base de datos
@Table                                                //@Table le dice como se llamara la tabla
public class Pais {

    @Id                                               //@Id es nuestra llave primaria de la tabla (indentificador)
    @GeneratedValue (strategy = GenerationType.AUTO)  //@GeneratedValue Genera el id automaticamente de cada Pais
    private int id;
    private String nombre;

    //Constructor
    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //Getters Y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
