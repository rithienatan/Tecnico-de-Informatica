create database sistemacompleto;

use SistemaCompleto;

create table estado
(
id_estado int primary key auto_increment,
nome_estado varchar (50) not null,
sigla_estado varchar (2) not null
);


create table cidade
(
id_cidade int primary key auto_increment,
nome_cidade varchar (50) not null,
id_estado int references estado (id_estado)
);
ALTER TABLE cidade ADD INDEX id_estado (id_estado);
ALTER TABLE cidade ADD CONSTRAINT estado_ibfk_1 FOREIGN KEY (id_estado) REFERENCES estado (id_estado) ON DELETE CASCADE  ON UPDATE CASCADE;


create table bairro
(
id_bairro int primary key auto_increment,
nome_bairro varchar (50) not null, 
id_cidade int references cidade (id_cidade)
);

create table telefone
(
id_telefone int primary key auto_increment,
num_tel varchar (15) not null
);

create table clientes
(
id_cliente int primary key auto_increment,
nome_cliente varchar (50) not null,
endereco_cliente varchar (50) not null, 
rg_cliente varchar (12) not null,
cpf_cliente varchar (12) not null,
id_bairro int references bairro (id_bairro),
id_cidade int references cidade (id_cidade)
);

create table fornecedores
(
id_fornecedor int primary key auto_increment, 
nome_fornecedor varchar (50) not null, 
endereco_fornecedor varchar (50) not null, 
cnpj_fornecedor varchar (20) not null, 
id_bairro int references bairro (id_bairro),
id_cidade int references cidade (id_cidade)
);

create table produtos
(
id_produto int primary key auto_increment,
nome_produto varchar (50) not null,
preco_compra numeric not null, 
preco_venda numeric not null, 
quantidade int,
id_fornecedor int references fornecedores (id_fornecedor)
); 

select * from estado;
delete from estado where id_estado in (1,2,3,4,5,6,7);
alter table estado auto_increment = 1;


 