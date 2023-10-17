package com.example.recargas.controller;

import com.example.recargas.entity.recargas;
import com.example.recargas.service.recargasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recargas")
public class recargasController {

    @Autowired
    private recargasService recargasService;

    @PostMapping(value= "/save", consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
    public recargas save(@RequestBody recargas recargas){return recargasService.save(recargas);}

}
