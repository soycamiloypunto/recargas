package com.example.recargas.repository;

import com.example.recargas.entity.recargas;
import com.example.recargas.repository.CRUD.recargasRepositoryCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class recargasRepository {
    @Autowired
    private recargasRepositoryCRUD recargasRepositoryCRUD;

    //Save
    public recargas save(recargas recargas){
        return recargasRepositoryCRUD.save(recargas);
    }

}
