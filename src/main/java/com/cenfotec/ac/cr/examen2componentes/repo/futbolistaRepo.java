package com.cenfotec.ac.cr.examen2componentes.repo;

import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface futbolistaRepo  extends JpaRepository<futbolista,Long> {

    public List<futbolista> findByNombreContaining(String word);

}
