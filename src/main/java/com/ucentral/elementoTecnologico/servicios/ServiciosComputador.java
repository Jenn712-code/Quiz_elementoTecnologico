package com.ucentral.elementoTecnologico.servicios;

import com.ucentral.elementoTecnologico.Operaciones.OperacionesComputador;
import com.ucentral.elementoTecnologico.Repositorios.RepositorioComputador;
import com.ucentral.elementoTecnologico.dto.ComputadorDto;
import com.ucentral.elementoTecnologico.entidades.Computador;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosComputador implements OperacionesComputador {
    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    RepositorioComputador repositoriosComputador;

    @Override
    public ComputadorDto crear(ComputadorDto computadorDto) {
        if (computadorDto != null){
            Computador computador =   repositoriosComputador.save(modelMapper.map(computadorDto, Computador.class));
            return modelMapper.map(computador, ComputadorDto.class);
        }

        else
            return null;
    }

    @Override
    public ComputadorDto actualizar(ComputadorDto computadorDto) {
        return null;
    }

    @Override
    public void borrar(ComputadorDto computadorDto) {

    }
    @Override
    public List<ComputadorDto> consultarT() {
        TypeToken<List<ComputadorDto>> typeToken = new TypeToken<>() {
        };
        return modelMapper.map(this.repositoriosComputador.findAll(), typeToken.getType());
    }

    @Override
    public ComputadorDto consultarPK(int pk) {
        return null;
    }
}
