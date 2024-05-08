package com.ucentral.elementoTecnologico.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComputadorDto {

    private Long serial;
    private String marca;
    private String color;
    private String tamaño;
    private Long precio;
}

