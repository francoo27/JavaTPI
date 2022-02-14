-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: java_tpi
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asiento`
--

DROP TABLE IF EXISTS `asiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asiento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) DEFAULT NULL,
  `fila` int DEFAULT NULL,
  `columna` int DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `adaptado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asiento`
--

LOCK TABLES `asiento` WRITE;
/*!40000 ALTER TABLE `asiento` DISABLE KEYS */;
INSERT INTO `asiento` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `fila`, `columna`, `numero`, `adaptado`) VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-1',1,1,NULL,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-2',1,2,NULL,1),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-3',1,3,NULL,1),(4,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-4',1,4,NULL,1),(5,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-5',1,5,NULL,1),(6,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-6',1,6,NULL,1),(7,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-7',1,7,NULL,1),(8,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-8',1,8,NULL,1),(9,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-9',1,9,NULL,1),(10,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-10',1,10,NULL,1),(11,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-1',2,1,NULL,0),(12,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-2',2,2,NULL,0),(13,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-3',2,3,NULL,0),(14,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-4',2,4,NULL,0),(15,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-5',2,5,NULL,0),(16,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-6',2,6,NULL,0),(17,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-7',2,7,NULL,1),(18,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-8',2,8,NULL,1),(19,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-9',2,9,NULL,0),(20,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-10',2,10,NULL,0),(21,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-1',3,1,NULL,0),(22,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-2',3,2,NULL,0),(23,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-3',3,3,NULL,0),(24,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-4',3,4,NULL,1),(25,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-5',3,5,NULL,1),(26,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-6',3,6,NULL,0),(27,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-7',3,7,NULL,0),(28,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-8',3,8,NULL,0),(29,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-9',3,9,NULL,0),(30,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-10',3,10,NULL,0),(31,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-1',4,1,NULL,0),(32,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-2',4,2,NULL,0),(33,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-3',4,3,NULL,0),(34,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-4',4,4,NULL,0),(35,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-5',4,5,NULL,0),(36,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-6',4,6,NULL,0),(37,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-7',4,7,NULL,0),(38,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-8',4,8,NULL,0),(39,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-9',4,9,NULL,0),(40,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-10',4,10,NULL,0),(41,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-1',5,1,NULL,0),(42,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-2',5,2,NULL,0),(43,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-3',5,3,NULL,0),(44,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-4',5,4,NULL,0),(45,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-5',5,5,NULL,0),(46,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-6',5,6,NULL,0),(47,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-7',5,7,NULL,0),(48,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-8',5,8,NULL,0),(49,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-9',5,9,NULL,0),(50,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-10',5,10,NULL,0),(51,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-1',1,1,NULL,1),(52,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-2',1,2,NULL,1),(53,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-3',1,3,NULL,1),(54,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-4',1,4,NULL,1),(55,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-5',1,5,NULL,1),(56,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-6',1,6,NULL,1);
/*!40000 ALTER TABLE `asiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audio`
--

DROP TABLE IF EXISTS `audio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `audio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audio`
--

LOCK TABLES `audio` WRITE;
/*!40000 ALTER TABLE `audio` DISABLE KEYS */;
INSERT INTO `audio` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Español'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Español Latino'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ingles'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ingles (Subtitulado)'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Frances'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Frances (Subtitulado)'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italiano'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italiano (Subtitulado)'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Portugues'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Portugues (Subtitulado)');
/*!40000 ALTER TABLE `audio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudad` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `id_pais` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pais` (`id_pais`),
  CONSTRAINT `ciudad_ibfk_1` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudad`
--

LOCK TABLES `ciudad` WRITE;
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `id_pais`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Rosario',1),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Buenos Aires',1),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Cordoba',1),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Santa Fe',1),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Cordoba',1),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Buenos Aires',1);
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clasificacion`
--

DROP TABLE IF EXISTS `clasificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clasificacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `identificador` varchar(128) DEFAULT NULL,
  `edad_minima` varchar(128) DEFAULT NULL,
  `recomendacion` varchar(128) DEFAULT NULL,
  `definicion` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificacion`
--

LOCK TABLES `clasificacion` WRITE;
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
INSERT INTO `clasificacion` (`id`, `fecha_creacion`, `fecha_modificacion`, `identificador`, `edad_minima`, `recomendacion`, `definicion`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','+13','+13 años','Apta para mayores de 13 años.','Desnudez fuerte y explícita —pero no pornográfica—, escenas fuertes, alcohol y drogas, insultos, imágenes muy intensas, muertes muy violentas y sangre en mucha cantidad —gore—. Se recomienda discreción para los menores de 16 años.'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','+16','+16 años','Apta para mayores de 16 años.','Desnudez parcial, sangre leve, muertes poco violentas, lenguaje regularizado e imágenes intensas suelen aparecer en las películas de esta clasificación. Pueden ingresar menores si van acompañados por un familiar o tutor.'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','+18','+18 años','Apta para mayores de 18 años.','Los menores de edad no están destinados a ver la película. Desnudez fuerte —pornografía—, violencia extrema, muertes extremadamente violentas, lenguaje ofensivo, derramamiento de sangre —gore extremo—, imágenes intensas frecuentes, escenas intensamente fuertes, insultos intensos y alcohol, drogas y tabaco.'),(5,'2021-10-06 17:43:43','2022-01-18 11:45:32','ATP','Apto para todo el publico','Apto para todo el publico','Todas las edades pueden ver. No hay desnudez ni sangre y/o alcohol. El lenguaje es cortÃÆÃâÃâ Ã¢â¬â¢ÃÆÃ¢â¬Å¡ÃâÃÂ©s sin el uso de insultos o con ofensas muy suaves que caen en lo gracioso.');
/*!40000 ALTER TABLE `clasificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complejo`
--

DROP TABLE IF EXISTS `complejo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complejo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `gerente` varchar(128) NOT NULL,
  `id_ciudad` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_ciudad` (`id_ciudad`),
  CONSTRAINT `complejo_ibfk_1` FOREIGN KEY (`id_ciudad`) REFERENCES `ciudad` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complejo`
--

LOCK TABLES `complejo` WRITE;
/*!40000 ALTER TABLE `complejo` DISABLE KEYS */;
INSERT INTO `complejo` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `gerente`, `id_ciudad`) VALUES (1,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Rosario Centro','Gerente Rosario',1),(2,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Cordoba','Gerente Cordoba',5),(3,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Buenos Aires','Gerente Buenos Aires',6);
/*!40000 ALTER TABLE `complejo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formato`
--

DROP TABLE IF EXISTS `formato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `id_audio` int DEFAULT NULL,
  `id_tecnologia_proyeccion` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_audio` (`id_audio`),
  KEY `id_tecnologia_proyeccion` (`id_tecnologia_proyeccion`),
  CONSTRAINT `formato_ibfk_1` FOREIGN KEY (`id_audio`) REFERENCES `audio` (`id`),
  CONSTRAINT `formato_ibfk_2` FOREIGN KEY (`id_tecnologia_proyeccion`) REFERENCES `tecnologia_proyeccion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formato`
--

LOCK TABLES `formato` WRITE;
/*!40000 ALTER TABLE `formato` DISABLE KEYS */;
INSERT INTO `formato` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `id_audio`, `id_tecnologia_proyeccion`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','2D Español',1,1),(5,'2022-01-24 16:41:17','2022-01-24 16:41:17','3D Frances',5,2);
/*!40000 ALTER TABLE `formato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `horaInicio` time DEFAULT NULL,
  `id_pelicula` int NOT NULL,
  `id_formato` int NOT NULL,
  `id_sala` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_formato` (`id_formato`),
  KEY `id_pelicula` (`id_pelicula`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `funcion_ibfk_1` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id`),
  CONSTRAINT `funcion_ibfk_2` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`),
  CONSTRAINT `funcion_ibfk_3` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `fechaInicio`, `horaInicio`, `id_pelicula`, `id_formato`, `id_sala`) VALUES (9,'2022-02-06 17:43:43','2022-02-06 17:43:43','a','2022-02-06','22:22:00',17,1,1);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Acción'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Aventuras'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ciencia Ficción'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Comedia.'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','No-Ficción / documental'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Drama'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Fantasía'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Musical'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Terror'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Suspenso'),(11,'2021-10-06 17:43:43','2021-10-06 17:43:43','Comedia');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `codigo` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `codigo`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Argentina','AR'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Uruguay','UY'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Estados Unidos','US'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Brasil','BR'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Chile','CL'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italia','IT'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Francia','FR'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Belgica','BE'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Holanda','HO'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Alemania','AL');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `titulo_original` varchar(128) NOT NULL,
  `titulo_pais` varchar(128) NOT NULL,
  `fecha_estreno` varchar(128) DEFAULT NULL,
  `imagen` varchar(300) DEFAULT NULL,
  `duracion` int DEFAULT NULL,
  `sinopsis` varchar(500) DEFAULT NULL,
  `id_clasificacion` int DEFAULT NULL,
  `id_pais` int DEFAULT NULL,
  `id_genero` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_clasificacion` (`id_clasificacion`),
  KEY `id_genero` (`id_genero`),
  KEY `id_pais` (`id_pais`),
  CONSTRAINT `pelicula_ibfk_1` FOREIGN KEY (`id_clasificacion`) REFERENCES `clasificacion` (`id`),
  CONSTRAINT `pelicula_ibfk_2` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`),
  CONSTRAINT `pelicula_ibfk_3` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`id`, `fecha_creacion`, `fecha_modificacion`, `titulo_original`, `titulo_pais`, `fecha_estreno`, `imagen`, `duracion`, `sinopsis`, `id_clasificacion`, `id_pais`, `id_genero`) VALUES (17,'2022-02-03 19:45:37','2022-02-03 19:45:37','TEST','TEST','2022-02-03',NULL,123,'123',2,2,1);
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula_formato`
--

DROP TABLE IF EXISTS `pelicula_formato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula_formato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_pelicula` int DEFAULT NULL,
  `id_formato` int DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_formato` (`id_formato`),
  KEY `id_pelicula` (`id_pelicula`),
  CONSTRAINT `pelicula_formato_ibfk_1` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id`),
  CONSTRAINT `pelicula_formato_ibfk_2` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula_formato`
--

LOCK TABLES `pelicula_formato` WRITE;
/*!40000 ALTER TABLE `pelicula_formato` DISABLE KEYS */;
INSERT INTO `pelicula_formato` (`id`, `id_pelicula`, `id_formato`, `fecha_creacion`) VALUES (17,17,1,'2022-02-03 19:45:37'),(18,17,5,'2022-02-03 19:45:37');
/*!40000 ALTER TABLE `pelicula_formato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `precio`
--

DROP TABLE IF EXISTS `precio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `precio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `codigo` varchar(128) NOT NULL,
  `valor` decimal(8,0) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `id_tipoPrecio` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tipoPrecio` (`id_tipoPrecio`),
  CONSTRAINT `precio_ibfk_1` FOREIGN KEY (`id_tipoPrecio`) REFERENCES `tipo_precio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `precio`
--

LOCK TABLES `precio` WRITE;
/*!40000 ALTER TABLE `precio` DISABLE KEYS */;
INSERT INTO `precio` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `codigo`, `valor`, `activo`, `id_tipoPrecio`) VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','A','A',150,1,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','B','B',300,1,2),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','C','C',200,1,3);
/*!40000 ALTER TABLE `precio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `numero` int NOT NULL,
  `id_complejo` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_complejo` (`id_complejo`),
  CONSTRAINT `sala_ibfk_1` FOREIGN KEY (`id_complejo`) REFERENCES `complejo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` (`id`, `fecha_creacion`, `fecha_modificacion`, `numero`, `id_complejo`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43',1,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39',2,1);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala_asiento`
--

DROP TABLE IF EXISTS `sala_asiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala_asiento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_sala` int DEFAULT NULL,
  `id_asiento` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_asiento` (`id_asiento`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `sala_asiento_ibfk_1` FOREIGN KEY (`id_asiento`) REFERENCES `asiento` (`id`),
  CONSTRAINT `sala_asiento_ibfk_2` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_asiento`
--

LOCK TABLES `sala_asiento` WRITE;
/*!40000 ALTER TABLE `sala_asiento` DISABLE KEYS */;
INSERT INTO `sala_asiento` (`id`, `id_sala`, `id_asiento`) VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(10,1,10),(11,1,11),(12,1,12),(13,1,13),(14,1,14),(15,1,15),(16,1,16),(17,1,17),(18,1,18),(19,1,19),(20,1,20),(21,1,21),(22,1,22),(23,1,23),(24,1,24),(25,1,25),(26,1,26),(27,1,27),(28,1,28),(29,1,29),(30,1,30),(31,1,31),(32,1,32),(33,1,33),(34,1,34),(35,1,35),(36,1,36),(37,1,37),(38,1,38),(39,1,39),(40,1,40),(41,1,41),(42,1,42),(43,1,43),(44,1,44),(45,1,45),(46,1,46),(47,1,47),(48,1,48),(49,1,49),(50,1,50),(51,2,51),(52,2,52),(53,2,53),(54,2,54),(55,2,55),(56,2,56);
/*!40000 ALTER TABLE `sala_asiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala_formato`
--

DROP TABLE IF EXISTS `sala_formato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala_formato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_sala` int DEFAULT NULL,
  `id_formato` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_formato` (`id_formato`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `sala_formato_ibfk_1` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id`),
  CONSTRAINT `sala_formato_ibfk_2` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_formato`
--

LOCK TABLES `sala_formato` WRITE;
/*!40000 ALTER TABLE `sala_formato` DISABLE KEYS */;
INSERT INTO `sala_formato` (`id`, `id_sala`, `id_formato`) VALUES (1,1,1);
/*!40000 ALTER TABLE `sala_formato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tecnologia_proyeccion`
--

DROP TABLE IF EXISTS `tecnologia_proyeccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tecnologia_proyeccion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecnologia_proyeccion`
--

LOCK TABLES `tecnologia_proyeccion` WRITE;
/*!40000 ALTER TABLE `tecnologia_proyeccion` DISABLE KEYS */;
INSERT INTO `tecnologia_proyeccion` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`) VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','2D'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','3D');
/*!40000 ALTER TABLE `tecnologia_proyeccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_precio`
--

DROP TABLE IF EXISTS `tipo_precio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_precio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `nombre` varchar(128) NOT NULL,
  `codigo` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_precio`
--

LOCK TABLES `tipo_precio` WRITE;
/*!40000 ALTER TABLE `tipo_precio` DISABLE KEYS */;
INSERT INTO `tipo_precio` (`id`, `fecha_creacion`, `fecha_modificacion`, `nombre`, `codigo`) VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','Niños','NINO'),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','Adulto','ADULTO'),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','Jubilado','JUBILADO');
/*!40000 ALTER TABLE `tipo_precio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `public_id` varchar(256) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `password` varchar(256) DEFAULT NULL,
  `admin` tinyint(1) DEFAULT NULL,
  `gerente` tinyint(1) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-14 11:18:39
