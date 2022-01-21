package com.gyovane.api_gerador_pessoas;

import com.gyovane.api_gerador_pessoas.beans.Pessoa;
import com.gyovane.api_gerador_pessoas.beans.PessoaFisica;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGeradorPessoasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGeradorPessoasApplication.class, args);
        PessoaFisica pessoaFisica= new PessoaFisica();
        System.out.println(pessoaFisica.gerarNome());
    }

}
