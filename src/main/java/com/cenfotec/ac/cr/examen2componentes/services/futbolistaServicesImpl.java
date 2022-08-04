package com.cenfotec.ac.cr.examen2componentes.services;

import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;
import com.cenfotec.ac.cr.examen2componentes.repo.futbolistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class futbolistaServicesImpl implements futbolistaService{

    @Autowired
    futbolistaRepo jugadorRepo;

    @Override
    public  void registrarFutbolista(futbolista jugador){
        jugadorRepo.save(jugador);
    }

    @Override
    public List<futbolista> listarFutbolistas(){
        return jugadorRepo.findAll();
    }

    @Override
    public Optional<futbolista> get(Long id) {
        return jugadorRepo.findById(id);
    }

    @Override
    public List<futbolista> find(String nombre) {
        return jugadorRepo.findByNombreContaining(nombre);
    }

}
