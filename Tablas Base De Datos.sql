-- TABLA LOGIN --
create database requerimiento;

CREATE TABLE login (id int  NOT NULL AUTO_INCREMENT,
							   usuario VARCHAR(15),
							   pass VARCHAR(10),
                               PRIMARY KEY (id));
															
INSERT INTO login (usuario,pass) VALUES ('root','root');

select * from login;

-- ---------------------TABLAS GERENCIA Y DEPARTAMENTOS---------------------------- --
CREATE TABLE gerencias (id_gerencia int  NOT NULL AUTO_INCREMENT,
							   gerencia VARCHAR(40),
							   PRIMARY KEY (id_gerencia));
                               
CREATE TABLE departamentos (id_departamento int  NOT NULL AUTO_INCREMENT,
							   departamento VARCHAR(40),
							   PRIMARY KEY (id_departamento),
                               id_gerencia int, 
                               foreign key(id_gerencia) references gerencias(id_gerencia));
															
INSERT INTO gerencias (id_gerencia,gerencia) VALUES ('1','informatica');
INSERT INTO gerencias (id_gerencia,gerencia) VALUES ('2','RRHH');
INSERT INTO departamentos (id_departamento,departamento,id_gerencia) VALUES ('1','redes','1');
INSERT INTO departamentos (id_departamento,departamento,id_gerencia) VALUES ('2','soporte','1');
INSERT INTO departamentos (id_departamento,departamento,id_gerencia) VALUES ('3','reclutamiento','2');
INSERT INTO departamentos (id_departamento,departamento,id_gerencia) VALUES ('4','Compensaciones ','2');

select * from gerencias;
select * from departamentos;

select * from departamentos where id_gerencia = 2;


SELECT * FROM departamentos


-- -------------- Tablas de asignaciones y encargados-------------------- --


CREATE TABLE asignaciones (id_asignacion int  NOT NULL AUTO_INCREMENT,
							   asignacion VARCHAR(40),
							   PRIMARY KEY (id_asignacion));
                               
CREATE TABLE encargados (id_encargado int  NOT NULL AUTO_INCREMENT,
							   encargado VARCHAR(40),
							   PRIMARY KEY (id_encargado),
                               id_asignacion int, 
                               foreign key(id_asignacion) references asignaciones(id_asignacion));
                               
                               
INSERT INTO asignaciones (asignacion) VALUES ('Abastecimiento');
INSERT INTO asignaciones (asignacion) VALUES ('TIC');
INSERT INTO encargados (encargado,id_asignacion) VALUES ('maria gonzalez','1');
INSERT INTO encargados (encargado,id_asignacion) VALUES ('pedro luco ','1');
INSERT INTO encargados (encargado,id_asignacion) VALUES ('marco yañez ','2');
INSERT INTO encargados (encargado,id_asignacion) VALUES ('jose molina ','2');

select * from asignaciones;
select * from encargados;

-- -------------- Tabla completaa-------------------- --

create table requerimientos (id_requerimiento int not null auto_increment,
                              gerente VARCHAR(40),
                              departamento VARCHAR(40),
                              asignacion VARCHAR(40),
                              encargado VARCHAR(40),
                              requerimiento varchar(150),
                              PRIMARY KEY (id_requerimiento));
                              
     select * from requerimientos;                         
                              
SELECT * FROM encargados


