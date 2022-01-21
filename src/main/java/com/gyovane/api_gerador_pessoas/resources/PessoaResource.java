package com.gyovane.api_gerador_pessoas.resources;


import com.gyovane.api_gerador_pessoas.beans.Pessoa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PessoaResource {

    @RequestMapping(method = RequestMethod.GET, value = "/te" )
    public List<Pessoa> listar(){
        Pessoa p1 = new Pessoa("Gy","gyy","111","23231");

        return Arrays.asList(p1);
    }
}
