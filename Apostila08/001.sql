CREATE DATABASE db_apo08;
USE db_apo08;

CREATE TABLE tb_usuario 
(id INT PRIMARY KEY AUTO_INCREMENT, 
nome VARCHAR(200), 
senha VARCHAR(200)
);

INSERT INTO tb_usuario (nome, senha) VALUES ('admin', 'admin');