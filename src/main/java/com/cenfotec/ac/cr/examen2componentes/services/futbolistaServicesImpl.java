package com.cenfotec.ac.cr.examen2componentes.services;

import com.cenfotec.ac.cr.examen2componentes.entities.futbolista;
import com.cenfotec.ac.cr.examen2componentes.repo.futbolistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
