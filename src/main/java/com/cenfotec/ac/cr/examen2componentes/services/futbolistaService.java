package com.cenfotec.ac.cr.examen2componentes.services;
import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;

import java.util.List;
import java.util.Optional;

public interface futbolistaService {

   public void registrarFutbolista(futbolista jugador);

   public List<futbolista> listarFutbolistas();

   public Optional<futbolista> get(Long id);

   public List<futbolista> find(String nombre);

}
