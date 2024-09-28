package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name="localidad")
@AllArgsConstructor
@NoArgsConstructor //constructor vacio
@Setter
@Getter
@Builder
@Audited

public class Localidad extends Base {

    private String denominacion;


}
