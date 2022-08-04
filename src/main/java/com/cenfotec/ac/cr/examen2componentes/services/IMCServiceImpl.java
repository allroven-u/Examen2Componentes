package com.cenfotec.ac.cr.examen2componentes.services;

import com.cenfotec.ac.cr.examen2componentes.entities.IMC;
import com.cenfotec.ac.cr.examen2componentes.repo.IMCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMCServiceImpl implements IMCService{

    @Autowired
    IMCRepo imcRepo;

    @Override
    public void registrarIMC(IMC imc){
        imcRepo.save(imc);
    }

}
