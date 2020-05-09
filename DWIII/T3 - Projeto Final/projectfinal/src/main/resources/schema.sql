drop table if exists funcionario;

drop table if exists restaurante;

create table restaurante(
    id_restaurante bigint auto_increment,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    numero int not null,
    email varchar(100) not null,
    ddd int not null,
    telefone long not null,
    primary key(id_restaurante)
    );

drop table if exists cliente;

create table cliente(
    id_cliente bigint auto_increment,
    nome varchar(100) not null,
    sobrenome varchar(100) not null,
    email varchar(100) not null,
    ddd int not null,
    telefone long not null,
    primary key(id_cliente)
    );