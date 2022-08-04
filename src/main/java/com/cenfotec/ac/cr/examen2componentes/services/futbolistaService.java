package com.cenfotec.ac.cr.examen2componentes.services;
import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;

import java.util.List;

public interface futbolistaService {

    void registrarFutbolista(futbolista jugador);

    List<futbolista> listarFutbolistas();


}
