package com.ucentral.elementoTecnologico.Repositorios;

import com.ucentral.elementoTecnologico.entidades.Computador;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioComputador extends CrudRepository<Computador, Long>, JpaSpecificationExecutor<Computador> {
}
