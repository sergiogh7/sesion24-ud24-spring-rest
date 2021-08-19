DROP table IF EXISTS trabajadores;

create table trabajadores(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario double,
	fecha date
);

insert into trabajadores (nombre, trabajo,salario,fecha) values('Manolo','DIRECTOR',5000, NOW());
insert into trabajadores (nombre, trabajo,salario,fecha) values('Ruben','PEON',1500, NOW());
insert into trabajadores (nombre, trabajo,salario,fecha) values('Queco','ENCARGADO',2350, NOW());
insert into trabajadores (nombre, trabajo,salario,fecha) values('Raul','COORDINADOR',1600, NOW());