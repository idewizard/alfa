package com.andiie.alfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andiie.alfa.model.Chamado;


@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

}
