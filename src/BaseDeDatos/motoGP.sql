drop database if exists motoGP;
create database motoGP;

use motoGP;

create table clasificacion (
    posicion int auto_increment primary key,
    puntos int
);

create table pilotos (
    codPiloto int auto_increment primary key,
    numeroPiloto int(2),
    nombre varchar(20),
    nacionalidad varchar(40),
    equipo varchar(30),
    moto varchar(20),
    fechaNac date,
    sueldo float(10 , 2 ),
    vigenteCampeon boolean,
    posicion int unique,
    foreign key (posicion)
        references clasificacion (posicion)
        on delete no action on update no action
);

insert clasificacion values
(1,100),
(2,72),
(3,61),
(4,45),
(5,35),
(6,30),
(7,30),
(8,28),
(9,25),
(10,25),
(11,23),
(12,19),
(13,14),
(14,13),
(15,10),
(16,10),
(17,8),
(18,7),
(19,2),
(20,2),
(21,1),
(22,0),
(23,0);

insert pilotos(codPiloto, numeroPiloto, nombre, nacionalidad, equipo, moto, fechaNac, sueldo, vigenteCampeon, posicion) values
(1,4,'Andrea Dovizioso','/images/italia.png','Ducati Team','Ducati','1986-03-23',2000000,false,4),
(2,5,'Colin Edwards','/images/eeuu.png','MGM Forward Racing','F. Yamaha','1974-02-27',300000,false,18),
(3,6,'Stefan Bradl','/images/alemania.png','LCR Honda MotoGP','Honda','1989-11-29',400000,false,6),
(4,7,'Hiroshi Aoyama','/images/japon.png','Drive M7 Aspar','Honda','1981-10-25',300000,false,12),
(5,8,'Hector Barberá','/images/espana.png','Avintia Racing','Avintia','1986-11-02',300000,false,20),
(6,9,'Danilo Petrucci','/images/italia.png','Ioda Racing Project','ART','1990-10-24',300000,false,19),
(7,17,'Karel Abraham','/images/repcheca.png','AB Motoracing','Honda','1990-01-02',300000,false,17),
(8,19,'Álvaro Bautista','/images/espana.png','GO&FUN Honda Gresini','Honda','1984-11-21',1000000,false,15),
(9,23,'Broc Parkes','/images/australia.png','Paul Bird Motorsport','PBM','1981-12-24',300000,false,21),
(10,26,'Dani Pedrosa','/images/espana.png','Repsol Honda Team','Honda','1985-09-29',4000000,false,2),
(11,29,'Andrea Iannone','/images/italia.png','Pramac Racing','Ducati','1989-08-09',400000,false,9),
(12,35,'Cal Crutchlow','/images/uk.png','Ducati Team','Ducati','1985-10-29',600000,false,16),
(13,38,'Bradley Smith','/images/uk.png','Monster Yamaha Tech3','Yamaha','1990-11-28',500000,false,8),
(14,41,'Aleix Espargaró','/images/espana.png','MGM Forward Racing','F. Yamaha','1989-07-30',300000,false,7),
(15,44,'Pol Espargaró','/images/espana.png','Monster Yamaha Tech3','Yamaha','1991-07-10',300000,false,10),
(16,45,'Scott Redding','/images/uk.png','GO&FUN Honda Gresini','Honda','1993-01-04',300000,false,13),
(17,46,'Valentino Rossi','/images/italia.png','Movistar Yamaha MotoGP','Yamaha','1979-02-16',14000000,false,3),
(18,63,'Mike Di Meglio','/images/francia.png','Avintia Racing','Avintia','1988-01-17',300000,false,23),
(19,68,'Yonny Hernández','/images/colombia.png','Emergy TIP Pramac Racing','Ducati','1988-07-30',300000,false,14),
(20,69,'Nicky Hayden','/images/eeuu.png','Drive M7 Aspar','Honda','1981-07-30',500000,false,11),
(21,70,'Michael Laverty','/images/uk.png','Paul Bird Motorsport','PBM','1981-06-07',300000,false,22),
(22,93,'Marc Márquez','/images/espana.png','Repsol Honda Team','Honda','1993-02-17',11000000,true,1),
(23,99,'Jorge Lorenzo','/images/espana.png','Movistar Yamaha MotoGP','Yamaha','1987-05-04',7000000,false,5);