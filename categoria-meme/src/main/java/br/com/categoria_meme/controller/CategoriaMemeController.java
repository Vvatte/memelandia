package br.com.categoria_meme.controller;

import br.com.categoria_meme.entity.CategoriaMeme;
import br.com.categoria_meme.service.ServicoCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categoria-memes")
public class CategoriaMemeController {

    @Autowired
    private ServicoCategoriaMeme servicoCategoriaMeme;

    @GetMapping
    public List<CategoriaMeme> buscaCategorias() {
        return servicoCategoriaMeme.listaTodasCategorias();
    }

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoCategoriaMeme.novaCategoriaMeme(categoriaMeme);
    }
}
