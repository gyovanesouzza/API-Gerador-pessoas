package com.gyovane.api_gerador_pessoas.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PessoaJurica")

public class PessoaJurica extends Pessoa implements Serializable {

    private String razaoSocial;
    private String cnpj;
    private String inscricaoEstadual;

    private String porte;
    private Date data_abertura;
    private String nitPisPasep;
    private String situacaoFuncionamento;
    private String ramoAtividade;
    private Long capitalSocial;
    private String site;



    public PessoaJurica(){
    }

    public PessoaJurica(String nome, String email, String telefone, String celular, String razaoSocial, String cnpj, String inscricaoEstadual, String porte, Date data_abertura, String nitPisPasep, String situacaoFuncionamento, String ramoAtividade, Long capitalSocial, String site) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.porte = porte;
        this.data_abertura = data_abertura;
        this.nitPisPasep = nitPisPasep;
        this.situacaoFuncionamento = situacaoFuncionamento;
        this.ramoAtividade = ramoAtividade;
        this.capitalSocial = capitalSocial;
        this.site = site;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getNitPisPasep() {
        return nitPisPasep;
    }

    public void setNitPisPasep(String nitPisPasep) {
        this.nitPisPasep = nitPisPasep;
    }

    public String getSituacaoFuncionamento() {
        return situacaoFuncionamento;
    }

    public void setSituacaoFuncionamento(String situacaoFuncionamento) {
        this.situacaoFuncionamento = situacaoFuncionamento;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    public Long getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(Long capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }


}
