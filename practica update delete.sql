create database estudiante;
use estudiante;
create table estudiantes (
usuario varchar(20) not null ,
pasword varchar(20) not null,
nombres varchar(20) not null,
apellidos varchar(20) not null,
correo varchar(20) not null,
estado varchar(1) not null

);

insert into usuario(usuario,pasword,nombres,apellidos,correo,estado)
values('pepe', '0930136106', 'Jose', 'Guevara','jegz_07@hotmail.com','a');
select * from empleado;

UPDATE empleado SET nombre='Alberto',apellido = 'Basante' 
WHERE cedula = '0932146293';

UPDATE empleado SET sueldo=2000,estado = 'I' 
WHERE cedula = '0984769105';

Delete from empleado where cedula = '0987647034';


