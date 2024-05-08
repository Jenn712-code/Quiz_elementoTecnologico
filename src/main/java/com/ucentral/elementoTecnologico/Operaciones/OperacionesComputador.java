package com.ucentral.elementoTecnologico.Operaciones;

import com.ucentral.elementoTecnologico.dto.ComputadorDto;
import com.ucentral.elementoTecnologico.entidades.Computador;
import java.util.List;

public interface OperacionesComputador {

        public ComputadorDto crear(ComputadorDto computadorDto);
        public ComputadorDto actualizar(ComputadorDto computadorDto);
        public void borrar(ComputadorDto computadorDto);
        public List<ComputadorDto> consultarT();
        public ComputadorDto consultarPK(int pk);
}
