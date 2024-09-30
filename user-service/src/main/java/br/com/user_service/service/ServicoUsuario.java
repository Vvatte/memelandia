package br.com.user_service.service;

import br.com.user_service.entity.Usuario;
import br.com.user_service.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ServicoUsuario {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }
}
