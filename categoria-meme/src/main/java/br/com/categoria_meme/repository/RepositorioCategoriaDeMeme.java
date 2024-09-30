package br.com.categoria_meme.repository;

import br.com.categoria_meme.entity.CategoriaDeMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaDeMeme extends JpaRepository<CategoriaDeMeme, Long> {
}
