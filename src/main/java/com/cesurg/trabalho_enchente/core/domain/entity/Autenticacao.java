package com.cesurg.trabalho_enchente.core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "autenticacao")
public class Autenticacao {
    @Id
    private Integer id;
    @Column
    private Integer idUsuario;
    @Column
    private String data_hora;
    @Column
    private String ip_origem;
    @Column
    private boolean sucesso;
    @Column
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getIp_origem() {
        return ip_origem;
    }

    public void setIp_origem(String ip_origem) {
        this.ip_origem = ip_origem;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
