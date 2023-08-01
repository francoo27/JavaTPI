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
INSERT INTO `asiento` VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-1',1,1,NULL,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-2',1,2,NULL,1),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-3',1,3,NULL,1),(4,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-4',1,4,NULL,1),(5,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-5',1,5,NULL,1),(6,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-6',1,6,NULL,1),(7,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-7',1,7,NULL,1),(8,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-8',1,8,NULL,1),(9,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-9',1,9,NULL,1),(10,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-10',1,10,NULL,1),(11,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-1',2,1,NULL,0),(12,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-2',2,2,NULL,0),(13,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-3',2,3,NULL,0),(14,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-4',2,4,NULL,0),(15,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-5',2,5,NULL,0),(16,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-6',2,6,NULL,0),(17,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-7',2,7,NULL,1),(18,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-8',2,8,NULL,1),(19,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-9',2,9,NULL,0),(20,'2021-11-10 21:41:39','2021-11-10 21:41:39','B-10',2,10,NULL,0),(21,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-1',3,1,NULL,0),(22,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-2',3,2,NULL,0),(23,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-3',3,3,NULL,0),(24,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-4',3,4,NULL,1),(25,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-5',3,5,NULL,1),(26,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-6',3,6,NULL,0),(27,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-7',3,7,NULL,0),(28,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-8',3,8,NULL,0),(29,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-9',3,9,NULL,0),(30,'2021-11-10 21:41:39','2021-11-10 21:41:39','C-10',3,10,NULL,0),(31,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-1',4,1,NULL,0),(32,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-2',4,2,NULL,0),(33,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-3',4,3,NULL,0),(34,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-4',4,4,NULL,0),(35,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-5',4,5,NULL,0),(36,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-6',4,6,NULL,0),(37,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-7',4,7,NULL,0),(38,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-8',4,8,NULL,0),(39,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-9',4,9,NULL,0),(40,'2021-11-10 21:41:39','2021-11-10 21:41:39','D-10',4,10,NULL,0),(41,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-1',5,1,NULL,0),(42,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-2',5,2,NULL,0),(43,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-3',5,3,NULL,0),(44,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-4',5,4,NULL,0),(45,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-5',5,5,NULL,0),(46,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-6',5,6,NULL,0),(47,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-7',5,7,NULL,0),(48,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-8',5,8,NULL,0),(49,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-9',5,9,NULL,0),(50,'2021-11-10 21:41:39','2021-11-10 21:41:39','E-10',5,10,NULL,0),(51,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-1',1,1,NULL,1),(52,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-2',1,2,NULL,1),(53,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-3',1,3,NULL,1),(54,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-4',1,4,NULL,1),(55,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-5',1,5,NULL,1),(56,'2021-11-10 21:41:39','2021-11-10 21:41:39','A-6',1,6,NULL,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audio`
--

LOCK TABLES `audio` WRITE;
/*!40000 ALTER TABLE `audio` DISABLE KEYS */;
INSERT INTO `audio` VALUES (1,'2021-10-06 17:43:43','2023-07-15 18:27:49','Español'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Español Latino'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ingles'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ingles (Subtitulado)'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Frances'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Frances (Subtitulado)'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italiano'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italiano (Subtitulado)'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Portugues'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Portugues (Subtitulado)');
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
INSERT INTO `ciudad` VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Rosario',1),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Buenos Aires',1),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Cordoba',1),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Santa Fe',1),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Cordoba',1),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Buenos Aires',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificacion`
--

LOCK TABLES `clasificacion` WRITE;
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
INSERT INTO `clasificacion` VALUES (1,'2021-10-06 17:43:43','2023-07-17 21:33:02','+13','+13 años','Apta para mayores de 13 años','Desnudez fuerte y explicita pero no pornografica, escenas fuertes, alcohol y drogas, insultos, imagenes muy intensas, muertes muy violentas y sangre en mucha cantidad gore. Se recomienda discrecion para los menores de 16 años'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','+16','+16 años','Apta para mayores de 16 años.','Desnudez parcial, sangre leve, muertes poco violentas, lenguaje regularizado e imágenes intensas suelen aparecer en las películas de esta clasificación. Pueden ingresar menores si van acompañados por un familiar o tutor.'),(3,'2021-10-06 17:43:43','2022-02-18 16:50:34','+18','+18 años','Apta para mayores de 18 aÃ±os.','Los menores de edad no estÃ¡n destinados a ver la pelÃ­cula. Desnudez fuerte pornografÃ­a, violencia extrema, muertes extremadamente violentas, lenguaje ofensivo, derramamiento de sangre gore extremo, imÃ¡genes intensas frecuentes, escenas intensamente fuertes, insultos intensos y alcohol, drogas y tabaco.'),(5,'2021-10-06 17:43:43','2022-02-18 16:50:23','ATP','Apto para todo el publico','Apto para todo el publico','Todas las edades pueden ver. No hay desnudez ni sangre y/o alcohol. El lenguaje es  sin el uso de insultos o con ofensas muy suaves que caen en lo gracioso.');
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
INSERT INTO `complejo` VALUES (1,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Rosario Centro','Gerente Rosario',1),(2,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Cordoba','Gerente Cordoba',5),(3,'2022-02-06 17:43:43','2022-02-06 17:43:43','Complejo Buenos Aires','Gerente Buenos Aires',6);
/*!40000 ALTER TABLE `complejo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `email` varchar(128) NOT NULL,
  `nombre` varchar(128) NOT NULL,
  `id_funcion` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_funcion` (`id_funcion`),
  CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`id_funcion`) REFERENCES `funcion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (35,'2023-07-16 16:34:05','2023-07-16 16:34:05','francoo_27@hotmail.com','qwrqweqwrqwrqwrqwrwqwrrqwr',23),(36,'2023-07-16 16:36:22','2023-07-16 16:36:22','francoo_27@hotmail.com','sadqweqw',22),(37,'2023-07-17 17:01:54','2023-07-17 17:01:54','francoo_27@hotmail.com','qweqwrwrqwrqwr',22),(38,'2023-07-17 17:58:18','2023-07-17 17:58:18','francoo_27@hotmail.com','rqw',22),(39,'2023-07-17 18:00:04','2023-07-17 18:00:04','francoo_27@hotmail.com','ewqrwqwr',22),(40,'2023-07-17 18:55:59','2023-07-17 18:55:59','francoo_27@hotmail.com','FrancoPinacca',26),(41,'2023-07-17 18:56:40','2023-07-17 18:56:40','francoo_27@hotmail.com','FrancoPinacca',26),(42,'2023-07-17 18:57:41','2023-07-17 18:57:41','francoo_27@hotmail.com','FrancoPinacca',26),(43,'2023-07-17 19:02:16','2023-07-17 19:02:16','francoo_27@hotmail.com','FrancoPinacca',26),(44,'2023-07-17 19:02:26','2023-07-17 19:02:26','francoo_27@hotmail.com','FrancoPinacca',26),(45,'2023-07-17 19:03:27','2023-07-17 19:03:27','francoo_27@hotmail.com','FrancoPinacca',26),(46,'2023-07-17 19:03:35','2023-07-17 19:03:35','francoo_27@hotmail.com','FrancoPinacca',26),(47,'2023-07-17 19:05:02','2023-07-17 19:05:02','francoo_27@hotmail.com','FrancoPinacca',26),(48,'2023-07-17 19:05:48','2023-07-17 19:05:48','francoo_27@hotmail.com','FrancoPinacca',26),(49,'2023-07-17 19:09:47','2023-07-17 19:09:47','francoo_27@hotmail.com','qwwrqwrq',26),(50,'2023-07-17 19:29:05','2023-07-17 19:29:05','gggggg@fgffff.com','ggggg',26),(51,'2023-07-18 17:08:56','2023-07-18 17:08:56','francoo_27@hotmail.com','rwqrwrqw',27);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra_ticket`
--

DROP TABLE IF EXISTS `compra_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra_ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_compra` int DEFAULT NULL,
  `id_ticket` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_compra` (`id_compra`),
  KEY `id_ticket` (`id_ticket`),
  CONSTRAINT `compra_ticket_ibfk_1` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id`),
  CONSTRAINT `compra_ticket_ibfk_2` FOREIGN KEY (`id_ticket`) REFERENCES `ticket` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra_ticket`
--

LOCK TABLES `compra_ticket` WRITE;
/*!40000 ALTER TABLE `compra_ticket` DISABLE KEYS */;
INSERT INTO `compra_ticket` VALUES (84,35,93),(85,35,94),(86,35,95),(87,35,96),(88,36,97),(89,37,98),(90,37,99),(91,38,100),(92,38,101),(93,38,102),(94,39,103),(95,39,104),(96,40,105),(97,40,106),(98,40,107),(99,40,108),(100,41,109),(101,41,110),(102,41,111),(103,41,112),(104,42,113),(105,42,114),(106,42,115),(107,42,116),(108,43,117),(109,43,118),(110,43,119),(111,43,120),(112,44,121),(113,44,122),(114,44,123),(115,44,124),(116,45,125),(117,45,126),(118,45,127),(119,45,128),(120,46,129),(121,46,130),(122,46,131),(123,46,132),(124,47,133),(125,47,134),(126,47,135),(127,47,136),(128,48,137),(129,48,138),(130,48,139),(131,48,140),(132,49,141),(133,49,142),(134,50,143),(135,51,144),(136,51,145);
/*!40000 ALTER TABLE `compra_ticket` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formato`
--

LOCK TABLES `formato` WRITE;
/*!40000 ALTER TABLE `formato` DISABLE KEYS */;
INSERT INTO `formato` VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','2D Español',1,1),(5,'2022-01-24 16:41:17','2022-01-24 16:41:17','3D Frances',5,2),(7,'2023-07-15 16:53:35','2023-07-15 16:53:35','2D Portugues (Subtitulado)',10,1);
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
  `cancelada` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_formato` (`id_formato`),
  KEY `id_pelicula` (`id_pelicula`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `funcion_ibfk_1` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id`),
  CONSTRAINT `funcion_ibfk_2` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`),
  CONSTRAINT `funcion_ibfk_3` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` VALUES (22,'2023-07-16 16:23:08','2023-07-16 16:23:08','El padrino - 2D Español - Sala: 1 - 18/7 - 16:24','2023-07-18','16:24:00',18,1,1,NULL),(23,'2023-07-16 16:24:01','2023-07-16 16:24:01','El padrino - 2D Español - Sala: 1 - 20/7 - 16:21','2023-07-20','16:21:00',18,1,1,NULL),(26,'2023-07-17 17:00:24','2023-07-17 17:00:24','El padrino - 2D Español - Sala: 1 - Fecha: 18/7 - Horario: 18:0 - Complejo: Complejo Rosario Centro','2023-07-18','18:00:00',18,1,1,NULL),(27,'2023-07-17 19:26:01','2023-07-17 19:26:01','El padrino - 2D Español - Sala: 1 - Fecha: 20/7 - Horario: 20:25 - Complejo: Complejo Rosario Centro','2023-07-20','20:25:00',18,1,1,NULL),(28,'2023-07-17 19:26:01','2023-07-17 19:26:01','77777777777777777','2023-07-16','20:25:00',18,1,1,NULL),(29,'2023-07-31 17:16:51','2023-07-31 17:16:51','El padrino - 2D Español - Sala: 1 - Fecha: 4/8 - Horario: 17:17 - Complejo: Complejo Rosario Centro','2023-08-04','17:17:00',18,1,1,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','Acción'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Aventuras'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Ciencia Ficción'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Comedia.'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','No-Ficción / documental'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Drama'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Fantasía'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Musical'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Terror'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Suspenso'),(11,'2021-10-06 17:43:43','2021-10-06 17:43:43','Comedia');
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
INSERT INTO `pais` VALUES (1,'2021-10-06 17:43:43','2023-06-18 23:32:12','Argentina','AR'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','Uruguay','UY'),(3,'2021-10-06 17:43:43','2021-10-06 17:43:43','Estados Unidos','US'),(4,'2021-10-06 17:43:43','2021-10-06 17:43:43','Brasil','BR'),(5,'2021-10-06 17:43:43','2021-10-06 17:43:43','Chile','CL'),(6,'2021-10-06 17:43:43','2021-10-06 17:43:43','Italia','IT'),(7,'2021-10-06 17:43:43','2021-10-06 17:43:43','Francia','FR'),(8,'2021-10-06 17:43:43','2021-10-06 17:43:43','Belgica','BE'),(9,'2021-10-06 17:43:43','2021-10-06 17:43:43','Holanda','HO'),(10,'2021-10-06 17:43:43','2021-10-06 17:43:43','Alemania','AL');
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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (18,'2022-02-18 17:09:07','2023-07-18 16:11:50','The godfather','El padrino','2022-02-13','e4988f24-abf3-424a-a1e2-afb3ae95c4b7.jpg',200,'La película narra la historia de la familia mafiosa Corleone, centrándose en el hijo menor de Vito Corleone, Michael. La trama explora la transformación de Michael de un civilizado soldado de guerra a un líder despiadado de la mafia. La película presenta una mezcla de lealtad familiar, traiciones, violencia y poder, y sigue la lucha de Michael por mantener el imperio criminal de su familia mientras intenta proteger a sus seres queridos.',3,3,6),(21,'2023-07-15 18:10:33','2023-07-18 16:11:24','Casablanca','Casablanca','1942-11-18','52487e5f-825e-4666-923c-97985467b014.jpg',102,'En medio de la Segunda Guerra Mundial, en la ciudad de Casablanca en Marruecos, un expatriado americano llamado Rick Blaine se encuentra atrapado en un dilema emocional cuando su antiguo amor, Ilsa Lund, reaparece en su vida con su esposo, un líder de la resistencia checa. Rick debe elegir entre su propio dolor y la posibilidad de ayudar a Ilsa y a su esposo a escapar de los nazis.',1,4,5),(22,'2023-07-15 18:10:47','2023-07-18 16:13:13','2001: A Space Odyssey','2001: Una odisea del espacio','1968-03-26','816acc7d-5baf-41e9-9109-af283c19f19e.jpg',149,'En esta aclamada película de ciencia ficción, se presenta un viaje épico desde los albores de la humanidad hasta un futuro distante. La trama se centra en una misión espacial hacia Júpiter liderada por la inteligencia artificial HAL 9000 y tripulada por un grupo de astronautas. A medida que la misión avanza, se exploran temas como la evolución humana, la inteligencia artificial y los misterios del espacio, llevando al público a un viaje visual y filosófico único.',2,6,7),(23,'2023-07-30 21:20:14','2023-07-30 21:20:23','Mission Impossible','Mision imposible','2023-07-29','db941ac1-a336-41b3-9a5b-daebe561c2a6.jpg',200,'Sinopsis',2,3,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula_formato`
--

LOCK TABLES `pelicula_formato` WRITE;
/*!40000 ALTER TABLE `pelicula_formato` DISABLE KEYS */;
INSERT INTO `pelicula_formato` VALUES (23,18,1,'2023-07-15 18:28:23'),(24,18,5,'2023-07-15 18:28:23'),(25,23,1,'2023-07-30 21:20:14'),(26,23,5,'2023-07-30 21:20:14'),(27,23,7,'2023-07-30 21:20:14');
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
INSERT INTO `precio` VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','A','A',150,1,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','B','B',300,1,2),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','C','C',200,1,3);
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43',1,1),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39',2,1),(3,'2023-07-17 15:43:18','2023-07-17 15:43:18',1,2);
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
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_asiento` (`id_asiento`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `sala_asiento_ibfk_1` FOREIGN KEY (`id_asiento`) REFERENCES `asiento` (`id`),
  CONSTRAINT `sala_asiento_ibfk_2` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=738 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_asiento`
--

LOCK TABLES `sala_asiento` WRITE;
/*!40000 ALTER TABLE `sala_asiento` DISABLE KEYS */;
INSERT INTO `sala_asiento` VALUES (1,1,1,'2023-07-17 15:53:28'),(2,1,2,'2023-07-17 15:53:28'),(3,1,3,'2023-07-17 15:53:28'),(4,1,4,'2023-07-17 15:53:28'),(5,1,5,'2023-07-17 15:53:28'),(6,1,6,'2023-07-17 15:53:28'),(7,1,7,'2023-07-17 15:53:28'),(8,1,8,'2023-07-17 15:53:28'),(9,1,9,'2023-07-17 15:53:28'),(10,1,10,'2023-07-17 15:53:28'),(11,1,11,'2023-07-17 15:53:28'),(12,1,12,'2023-07-17 15:53:28'),(13,1,13,'2023-07-17 15:53:28'),(14,1,14,'2023-07-17 15:53:28'),(15,1,15,'2023-07-17 15:53:28'),(16,1,16,'2023-07-17 15:53:28'),(17,1,17,'2023-07-17 15:53:28'),(18,1,18,'2023-07-17 15:53:28'),(19,1,19,'2023-07-17 15:53:28'),(20,1,20,'2023-07-17 15:53:28'),(21,1,21,'2023-07-17 15:53:28'),(22,1,22,'2023-07-17 15:53:28'),(23,1,23,'2023-07-17 15:53:28'),(24,1,24,'2023-07-17 15:53:28'),(25,1,25,'2023-07-17 15:53:28'),(26,1,26,'2023-07-17 15:53:28'),(27,1,27,'2023-07-17 15:53:28'),(28,1,28,'2023-07-17 15:53:28'),(29,1,29,'2023-07-17 15:53:28'),(30,1,30,'2023-07-17 15:53:28'),(31,1,31,'2023-07-17 15:53:28'),(32,1,32,'2023-07-17 15:53:28'),(33,1,33,'2023-07-17 15:53:28'),(34,1,34,'2023-07-17 15:53:28'),(35,1,35,'2023-07-17 15:53:28'),(36,1,36,'2023-07-17 15:53:28'),(37,1,37,'2023-07-17 15:53:28'),(38,1,38,'2023-07-17 15:53:28'),(39,1,39,'2023-07-17 15:53:28'),(40,1,40,'2023-07-17 15:53:28'),(41,1,41,'2023-07-17 15:53:28'),(42,1,42,'2023-07-17 15:53:28'),(43,1,43,'2023-07-17 15:53:28'),(44,1,44,'2023-07-17 15:53:28'),(45,1,45,'2023-07-17 15:53:28'),(46,1,46,'2023-07-17 15:53:28'),(47,1,47,'2023-07-17 15:53:28'),(48,1,48,'2023-07-17 15:53:28'),(49,1,49,'2023-07-17 15:53:28'),(50,1,50,'2023-07-17 15:53:28'),(51,2,51,'2023-07-17 15:53:28'),(52,2,52,'2023-07-17 15:53:28'),(53,2,53,'2023-07-17 15:53:28'),(54,2,54,'2023-07-17 15:53:28'),(55,2,55,'2023-07-17 15:53:28'),(56,2,56,'2023-07-17 15:53:28'),(688,3,1,'2023-07-17 15:53:50'),(689,3,2,'2023-07-17 15:53:50'),(690,3,3,'2023-07-17 15:53:50'),(691,3,4,'2023-07-17 15:53:50'),(692,3,5,'2023-07-17 15:53:50'),(693,3,6,'2023-07-17 15:53:50'),(694,3,7,'2023-07-17 15:53:50'),(695,3,8,'2023-07-17 15:53:50'),(696,3,9,'2023-07-17 15:53:50'),(697,3,10,'2023-07-17 15:53:50'),(698,3,11,'2023-07-17 15:53:50'),(699,3,12,'2023-07-17 15:53:50'),(700,3,13,'2023-07-17 15:53:50'),(701,3,14,'2023-07-17 15:53:50'),(702,3,15,'2023-07-17 15:53:50'),(703,3,16,'2023-07-17 15:53:50'),(704,3,17,'2023-07-17 15:53:50'),(705,3,18,'2023-07-17 15:53:50'),(706,3,19,'2023-07-17 15:53:50'),(707,3,20,'2023-07-17 15:53:50'),(708,3,21,'2023-07-17 15:53:50'),(709,3,22,'2023-07-17 15:53:50'),(710,3,23,'2023-07-17 15:53:50'),(711,3,24,'2023-07-17 15:53:50'),(712,3,25,'2023-07-17 15:53:50'),(713,3,26,'2023-07-17 15:53:50'),(714,3,27,'2023-07-17 15:53:50'),(715,3,28,'2023-07-17 15:53:50'),(716,3,29,'2023-07-17 15:53:50'),(717,3,30,'2023-07-17 15:53:50'),(718,3,31,'2023-07-17 15:53:50'),(719,3,32,'2023-07-17 15:53:50'),(720,3,33,'2023-07-17 15:53:50'),(721,3,34,'2023-07-17 15:53:50'),(722,3,35,'2023-07-17 15:53:50'),(723,3,36,'2023-07-17 15:53:50'),(724,3,37,'2023-07-17 15:53:50'),(725,3,38,'2023-07-17 15:53:50'),(726,3,39,'2023-07-17 15:53:50'),(727,3,40,'2023-07-17 15:53:50'),(728,3,41,'2023-07-17 15:53:50'),(729,3,42,'2023-07-17 15:53:50'),(730,3,43,'2023-07-17 15:53:50'),(731,3,44,'2023-07-17 15:53:50'),(732,3,45,'2023-07-17 15:53:50'),(733,3,46,'2023-07-17 15:53:50'),(734,3,47,'2023-07-17 15:53:50'),(735,3,48,'2023-07-17 15:53:50'),(736,3,49,'2023-07-17 15:53:50'),(737,3,50,'2023-07-17 15:53:50');
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
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_formato` (`id_formato`),
  KEY `id_sala` (`id_sala`),
  CONSTRAINT `sala_formato_ibfk_1` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id`),
  CONSTRAINT `sala_formato_ibfk_2` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_formato`
--

LOCK TABLES `sala_formato` WRITE;
/*!40000 ALTER TABLE `sala_formato` DISABLE KEYS */;
INSERT INTO `sala_formato` VALUES (1,1,1,'2023-07-17 15:55:55'),(29,3,1,'2023-07-17 15:56:09'),(30,3,5,'2023-07-17 15:56:09'),(31,3,7,'2023-07-17 15:56:09');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecnologia_proyeccion`
--

LOCK TABLES `tecnologia_proyeccion` WRITE;
/*!40000 ALTER TABLE `tecnologia_proyeccion` DISABLE KEYS */;
INSERT INTO `tecnologia_proyeccion` VALUES (1,'2021-10-06 17:43:43','2021-10-06 17:43:43','2D'),(2,'2021-10-06 17:43:43','2021-10-06 17:43:43','3D');
/*!40000 ALTER TABLE `tecnologia_proyeccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `id_asiento` int NOT NULL,
  `id_precio` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_asiento` (`id_asiento`),
  KEY `id_precio` (`id_precio`),
  CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`id_asiento`) REFERENCES `asiento` (`id`),
  CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`id_precio`) REFERENCES `precio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (51,'2022-02-06 17:43:43','2022-02-06 17:43:43',1,1),(52,'2022-09-09 17:43:43','2022-09-09 17:43:43',1,1),(60,'2022-08-21 15:11:32','2022-08-21 15:11:32',26,3),(61,'2022-08-21 15:13:01','2022-08-21 15:13:01',38,2),(62,'2022-08-21 16:59:40','2022-08-21 16:59:40',49,3),(63,'2022-08-21 16:59:40','2022-08-21 16:59:40',50,3),(64,'2022-08-21 16:59:40','2022-08-21 16:59:40',40,3),(65,'2022-08-21 16:59:40','2022-08-21 16:59:40',39,3),(66,'2022-08-21 17:00:08','2022-08-21 17:00:08',10,3),(67,'2022-08-21 17:00:08','2022-08-21 17:00:08',9,3),(68,'2022-08-21 17:00:08','2022-08-21 17:00:08',8,3),(69,'2022-08-21 17:00:08','2022-08-21 17:00:08',7,3),(70,'2022-08-21 17:00:08','2022-08-21 17:00:08',6,3),(71,'2023-07-04 23:35:44','2023-07-04 23:35:44',27,3),(72,'2023-07-04 23:35:44','2023-07-04 23:35:44',37,3),(73,'2023-07-04 23:36:44','2023-07-04 23:36:44',26,3),(74,'2023-07-06 16:19:16','2023-07-06 16:19:16',28,1),(75,'2023-07-06 16:19:16','2023-07-06 16:19:16',38,1),(76,'2023-07-06 16:19:16','2023-07-06 16:19:16',39,1),(77,'2023-07-06 16:19:16','2023-07-06 16:19:16',29,2),(78,'2023-07-06 16:19:16','2023-07-06 16:19:16',19,2),(79,'2023-07-06 16:20:15','2023-07-06 16:20:15',28,1),(80,'2023-07-06 16:20:15','2023-07-06 16:20:15',38,1),(81,'2023-07-06 16:20:15','2023-07-06 16:20:15',39,1),(82,'2023-07-06 16:20:15','2023-07-06 16:20:15',29,2),(83,'2023-07-06 16:20:15','2023-07-06 16:20:15',19,2),(84,'2023-07-06 16:23:39','2023-07-06 16:23:39',35,3),(85,'2023-07-07 12:49:15','2023-07-07 12:49:15',17,2),(86,'2023-07-07 12:49:15','2023-07-07 12:49:15',16,2),(87,'2023-07-07 12:49:15','2023-07-07 12:49:15',14,2),(88,'2023-07-07 12:49:15','2023-07-07 12:49:15',15,2),(89,'2023-07-07 12:49:15','2023-07-07 12:49:15',13,3),(90,'2023-07-07 12:49:15','2023-07-07 12:49:15',12,3),(91,'2023-07-15 17:57:25','2023-07-15 17:57:25',23,2),(92,'2023-07-15 17:57:25','2023-07-15 17:57:25',24,2),(93,'2023-07-16 16:34:05','2023-07-16 16:34:05',27,1),(94,'2023-07-16 16:34:05','2023-07-16 16:34:05',26,1),(95,'2023-07-16 16:34:05','2023-07-16 16:34:05',36,1),(96,'2023-07-16 16:34:05','2023-07-16 16:34:05',35,1),(97,'2023-07-16 16:36:22','2023-07-16 16:36:22',27,3),(98,'2023-07-17 17:01:54','2023-07-17 17:01:54',36,3),(99,'2023-07-17 17:01:54','2023-07-17 17:01:54',38,3),(100,'2023-07-17 17:58:18','2023-07-17 17:58:18',29,3),(101,'2023-07-17 17:58:18','2023-07-17 17:58:18',39,3),(102,'2023-07-17 17:58:18','2023-07-17 17:58:18',28,3),(103,'2023-07-17 18:00:04','2023-07-17 18:00:04',19,3),(104,'2023-07-17 18:00:04','2023-07-17 18:00:04',16,3),(105,'2023-07-17 18:55:59','2023-07-17 18:55:59',7,1),(106,'2023-07-17 18:55:59','2023-07-17 18:55:59',16,2),(107,'2023-07-17 18:55:59','2023-07-17 18:55:59',15,2),(108,'2023-07-17 18:55:59','2023-07-17 18:55:59',26,3),(109,'2023-07-17 18:56:40','2023-07-17 18:56:40',7,1),(110,'2023-07-17 18:56:40','2023-07-17 18:56:40',16,2),(111,'2023-07-17 18:56:40','2023-07-17 18:56:40',15,2),(112,'2023-07-17 18:56:40','2023-07-17 18:56:40',26,3),(113,'2023-07-17 18:57:41','2023-07-17 18:57:41',7,1),(114,'2023-07-17 18:57:41','2023-07-17 18:57:41',16,2),(115,'2023-07-17 18:57:41','2023-07-17 18:57:41',15,2),(116,'2023-07-17 18:57:41','2023-07-17 18:57:41',26,3),(117,'2023-07-17 19:02:16','2023-07-17 19:02:16',7,1),(118,'2023-07-17 19:02:16','2023-07-17 19:02:16',16,2),(119,'2023-07-17 19:02:16','2023-07-17 19:02:16',15,2),(120,'2023-07-17 19:02:16','2023-07-17 19:02:16',26,3),(121,'2023-07-17 19:02:26','2023-07-17 19:02:26',7,1),(122,'2023-07-17 19:02:26','2023-07-17 19:02:26',16,2),(123,'2023-07-17 19:02:26','2023-07-17 19:02:26',15,2),(124,'2023-07-17 19:02:26','2023-07-17 19:02:26',26,3),(125,'2023-07-17 19:03:27','2023-07-17 19:03:27',7,1),(126,'2023-07-17 19:03:27','2023-07-17 19:03:27',16,2),(127,'2023-07-17 19:03:27','2023-07-17 19:03:27',15,2),(128,'2023-07-17 19:03:27','2023-07-17 19:03:27',26,3),(129,'2023-07-17 19:03:35','2023-07-17 19:03:35',7,1),(130,'2023-07-17 19:03:35','2023-07-17 19:03:35',16,2),(131,'2023-07-17 19:03:35','2023-07-17 19:03:35',15,2),(132,'2023-07-17 19:03:36','2023-07-17 19:03:36',26,3),(133,'2023-07-17 19:05:02','2023-07-17 19:05:02',7,1),(134,'2023-07-17 19:05:02','2023-07-17 19:05:02',16,2),(135,'2023-07-17 19:05:02','2023-07-17 19:05:02',15,2),(136,'2023-07-17 19:05:03','2023-07-17 19:05:03',26,3),(137,'2023-07-17 19:05:48','2023-07-17 19:05:48',7,1),(138,'2023-07-17 19:05:48','2023-07-17 19:05:48',7,2),(139,'2023-07-17 19:05:48','2023-07-17 19:05:48',7,2),(140,'2023-07-17 19:05:48','2023-07-17 19:05:48',7,3),(141,'2023-07-17 19:09:47','2023-07-17 19:09:47',27,3),(142,'2023-07-17 19:09:47','2023-07-17 19:09:47',27,3),(143,'2023-07-17 19:29:05','2023-07-17 19:29:05',20,1),(144,'2023-07-18 17:08:56','2023-07-18 17:08:56',5,3),(145,'2023-07-18 17:08:56','2023-07-18 17:08:56',5,3);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
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
INSERT INTO `tipo_precio` VALUES (1,'2021-11-10 21:41:39','2021-11-10 21:41:39','Niños','NINO'),(2,'2021-11-10 21:41:39','2021-11-10 21:41:39','Adulto','ADULTO'),(3,'2021-11-10 21:41:39','2021-11-10 21:41:39','Jubilado','JUBILADO');
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
  `token` varchar(256) DEFAULT NULL,
  `token_valid_until` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (3,'2023-07-13 19:50:54','2023-07-13 19:50:54','1','ADMIN','ADMIN','ADMIN',1,1,'ADMIN@ADMIN.COM','716d55be-b1f8-4890-9715-006226e7d55c','2023-07-31 18:19:49');
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

-- Dump completed on 2023-08-01 18:40:29
