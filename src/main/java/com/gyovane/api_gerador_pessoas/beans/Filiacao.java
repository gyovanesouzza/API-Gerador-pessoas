package com.gyovane.api_gerador_pessoas.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Filiacao")
public class Filiacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mae;
    private String pai;

    @OneToOne(mappedBy = "filiacao")
    private PessoaFisica pessoaFisica;

    public Filiacao() {
    }

    public Filiacao(Long id, String mae, String pai, PessoaFisica pessoaFisica) {
        this.id = id;
        this.mae = mae;
        this.pai = pai;
        this.pessoaFisica = pessoaFisica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }
}
