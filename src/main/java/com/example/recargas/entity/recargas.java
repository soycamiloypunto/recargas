package com.example.recargas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table
public class recargas {
    @Id
    @Autowired
    private Integer id;

    @Column
    private Integer cantidad;

    @Column
    private Long valor;

    @Column(length = 512)
    private String operador;

    @Column(length = 512)
    private String usuario;

    public recargas() {
    }

    public recargas(Integer id, Integer cantidad, Long valor, String operador, String usuario) {
        this.id = id;
        this.cantidad = cantidad;
        this.valor = valor;
        this.operador = operador;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
