package com.example.recargas.service;

import com.example.recargas.entity.recargas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class recargasService {

    @Autowired
    private recargasRepository recargasRepository;

    public recargas save(recargas recargas){
        if(recargas.getId()==null){
            return recargasRepository.save(recargas);
        }
    }

}
