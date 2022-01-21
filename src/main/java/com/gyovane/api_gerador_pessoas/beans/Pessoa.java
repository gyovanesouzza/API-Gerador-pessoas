package com.gyovane.api_gerador_pessoas.beans;


import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idPessoa;
    private String nome;
    private String email;
    private String telefone;
    private String celular;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String telefone, String celular) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Long getId() {
        return idPessoa;
    }

    public void setId(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


}
