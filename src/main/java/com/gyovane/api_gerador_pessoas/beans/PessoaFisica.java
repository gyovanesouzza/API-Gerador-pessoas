package com.gyovane.api_gerador_pessoas.beans;


import com.gyovane.api_gerador_pessoas.beans.enuns.Type_person;
import com.gyovane.api_gerador_pessoas.beans.utils.Dados;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Random;

@Entity
@Table(name = "PessoaFisica")
public class PessoaFisica extends Pessoa implements Serializable {

    private String sobrenome;
    private String tipoPessoa = Type_person.Natural.name();
    private String rg;
    private String cpf;
    private String pis;
    private String estadoCivil;
    private String cns;
    private String cnae;
    private String sexo;
    private String dataNascimento;
    private String profissao;
    private String signo;
    private int idade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filiacao_id", referencedColumnName = "id")
    private Filiacao filiacao;


    public PessoaFisica() {

    }

    public PessoaFisica(String tipoPessoa, String rg, String cpf, String pis, String estadoCivil, String cns, String cnae, String sexo, String dataNascimento, String profissao, String signo, int idade) {
        this.tipoPessoa = tipoPessoa;
        this.rg = rg;
        this.cpf = cpf;
        this.pis = pis;
        this.estadoCivil = estadoCivil;
        this.cns = cns;
        this.cnae = cnae;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.signo = signo;
        this.idade = idade;
    }

    @Override
    public String getNome() {
        //return super.getNome() + this.sobrenome
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        this.sobrenome = nome;
        super.setNome(nome);
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String gerarNome(){
        Dados dados = new Dados();
        Random gerador = new Random();

        String nomeCompleto = "";
        nomeCompleto += dados.getNome("Homen").get(gerador.nextInt(dados.getNome("Homen").size()));
        for(int i = 0; i <=1;i++){
            nomeCompleto +=  " " + dados.getSOBRENOMES(gerador.nextInt(dados.getSOBRENOMES().size()));

        }

        return nomeCompleto.trim();

    }
}
