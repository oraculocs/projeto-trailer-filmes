drop database if exists midia;

create database midia;

use midia;

create table filme(idFilme int primary key auto_increment,
nome varchar (50) unique not null,
genero varchar(30) not null,
descricao varchar(255) not null,
trailer varchar(255) not null
);

insert into filme values(1, 'Halooween 2018', 'Terror', 'Jamie Lee Curtis x Michael Myers', 'https://www.youtube.com/v/ek1ePFp-nBI');

insert into filme values(2, 'Venom 2018', 'Super Herói Invertido', 'Eddie se torna Venom, uma máquina de matar incontrolável, que nem ele pode conter.', 'https://www.youtube.com/v/70JIXsey2iI');


insert into filme values(3, 'Tropa de Elite', 'Ação', 'O capitão Nascimento da Força Especial da Polícia Militar do Rio de Janeiro treina dois 
recrutas novatos para que possam sucedê-lo.', 'https://www.youtube.com/v/0jeTL9hC3Wg');

