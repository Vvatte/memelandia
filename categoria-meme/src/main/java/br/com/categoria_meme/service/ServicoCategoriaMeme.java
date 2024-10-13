package br.com.categoria_meme.service;

import br.com.categoria_meme.entity.CategoriaMeme;
import br.com.categoria_meme.repository.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoCategoriaMeme {
    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
