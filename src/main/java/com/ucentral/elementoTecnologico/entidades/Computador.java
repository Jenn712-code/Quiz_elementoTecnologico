package com.ucentral.elementoTecnologico.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Computadores")
public class Computador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Serial;

    @Column(name= "com_marca")
    private String marca;

    @Column(name= "com_color")
    private String color;

    @Column(name= "com_tamaño")
    private String tamaño;

    @Column(name= "com_precio")
    private Long precio;

}
