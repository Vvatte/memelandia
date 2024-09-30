package br.com.meme_service.repository;

import br.com.meme_service.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {


}
