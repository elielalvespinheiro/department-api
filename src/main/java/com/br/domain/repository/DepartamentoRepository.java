package com.br.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.br.domain.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, UUID>,
        JpaSpecificationExecutor<Departamento> {

}
