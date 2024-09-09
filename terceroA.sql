CREATE DATABASE  IF NOT EXISTS `terceroA` ;
USE `terceroA`;


DROP TABLE IF EXISTS `empleado`;

CREATE TABLE `empleado` (
  `cedula` varchar(10) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `sueldo` double NOT NULL,
  `fecha_registro` date NOT NULL,
  `estado` varchar(1) NOT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


--
-- Dumping data for table `empleado`
--


INSERT INTO `empleado` VALUES ('0932146293','Andres','Flores',1100,'2023-04-30','A'),('0945786810','Cesar','Villamar',700,'2024-10-14','A'),('0967571935','Jorge','Avila',700,'2023-01-04','A'),('0984769105','Daniel','Bustamante',700,'2024-09-24','A'),('0987647034','Jesus','Santos',700,'2024-10-13','A');

UNLOCK TABLES;

--
-- Table structure for table `estudiantes`
--

DROP TABLE IF EXISTS `estudiantes`;

CREATE TABLE `estudiantes` (
  `usuario` varchar(20) NOT NULL,
  `pasword` varchar(20) NOT NULL,
  `nombres` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `correo` varchar(20) NOT NULL,
  `estado` varchar(1) NOT NULL
);
--
-- Dumping data for table `estudiantes`
--
--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `usuario` varchar(20) NOT NULL,
  `pasword` varchar(20) NOT NULL,
  `nombres` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `correo` varchar(20) NOT NULL,
  `estado` varchar(1) NOT NULL,
  PRIMARY KEY (`usuario`)
) ;


--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` VALUES ('andres','251651496','pepecun','sonar','jwijdwj@jwdj','b'),('carl','1561894794','carla','Vasante','fefwejqidw@dwju','e'),('cusco','445416547','carlos','ruko','dwrwegrs@wijdwiu','d'),('jegz','651589594','ricardo','magno','dwdwqdwqd@dwd','c'),('pepe','0930136106','Jose','Guevara','jegz_07@hotmail.com','a');
