package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="autor")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Audited
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia", length = 1500)
    private String biografia;

    @ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable( name = "autor_libro",
            joinColumns = @JoinColumn(name = "autor_id"),
            inverseJoinColumns = @JoinColumn (name="libro_id"))
    @Builder.Default
    private List<Libro> libros= new ArrayList<Libro>();

}
