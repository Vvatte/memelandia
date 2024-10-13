package br.com.categoria_meme.repository;

import br.com.categoria_meme.entity.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
