CREATE TABLE categoria_meme (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   usuario_id BIGINT,
   CONSTRAINT pk_categoriameme PRIMARY KEY (id)
);

ALTER TABLE categoria_meme ADD CONSTRAINT FK_CATEGORIAMEME_ON_USUARIO FOREIGN KEY (usuario_id) REFERENCES usuario (id);