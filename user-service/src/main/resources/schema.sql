CREATE TABLE usuario (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   CONSTRAINT pk_usuario PRIMARY KEY (id)
);