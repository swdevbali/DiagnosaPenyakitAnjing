-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.44


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema yuli
--

CREATE DATABASE IF NOT EXISTS yuli;
USE yuli;

--
-- Definition of table `yuli`.`gejala`
--

DROP TABLE IF EXISTS `yuli`.`gejala`;
CREATE TABLE  `yuli`.`gejala` (
  `idgejala` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nama_gejala` varchar(50) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `deskripsi` text CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`idgejala`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`gejala`
--

/*!40000 ALTER TABLE `gejala` DISABLE KEYS */;
LOCK TABLES `gejala` WRITE;
INSERT INTO `yuli`.`gejala` VALUES  (1,'d','d'),
 (2,'kk','kk'),
 (3,'ddk','kk');
UNLOCK TABLES;
/*!40000 ALTER TABLE `gejala` ENABLE KEYS */;


--
-- Definition of table `yuli`.`gejala_penyakit`
--

DROP TABLE IF EXISTS `yuli`.`gejala_penyakit`;
CREATE TABLE  `yuli`.`gejala_penyakit` (
  `idgejala_penyakit` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idgejala` int(11) unsigned NOT NULL,
  `idpenyakit` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idgejala_penyakit`),
  KEY `idgejala` (`idgejala`),
  KEY `idpenyakit` (`idpenyakit`),
  CONSTRAINT `gejala_penyakit_ibfk_1` FOREIGN KEY (`idgejala`) REFERENCES `gejala` (`idgejala`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `gejala_penyakit_ibfk_2` FOREIGN KEY (`idpenyakit`) REFERENCES `penyakit` (`idpenyakit`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`gejala_penyakit`
--

/*!40000 ALTER TABLE `gejala_penyakit` DISABLE KEYS */;
LOCK TABLES `gejala_penyakit` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `gejala_penyakit` ENABLE KEYS */;


--
-- Definition of table `yuli`.`pasien`
--

DROP TABLE IF EXISTS `yuli`.`pasien`;
CREATE TABLE  `yuli`.`pasien` (
  `nama` varchar(45) CHARACTER SET latin1 NOT NULL,
  `hp` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `alamat` varchar(45) CHARACTER SET latin1 NOT NULL,
  `idpasien` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idpasien`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`pasien`
--

/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
LOCK TABLES `pasien` WRITE;
INSERT INTO `yuli`.`pasien` VALUES  ('Joko x','081915538541','Maguwo',2),
 ('Pram Wee','Rusak','Bantul',3),
 ('xx','xx','xx',4),
 ('yuli','yuli','yuli',5);
UNLOCK TABLES;
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;


--
-- Definition of table `yuli`.`pemakai`
--

DROP TABLE IF EXISTS `yuli`.`pemakai`;
CREATE TABLE  `yuli`.`pemakai` (
  `idpemakai` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) CHARACTER SET latin1 NOT NULL,
  `password` varchar(45) CHARACTER SET latin1 NOT NULL,
  `namaLengkap` varchar(45) CHARACTER SET latin1 NOT NULL,
  `keterangan` varchar(45) CHARACTER SET latin1 NOT NULL,
  `peran` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`idpemakai`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`pemakai`
--

/*!40000 ALTER TABLE `pemakai` DISABLE KEYS */;
LOCK TABLES `pemakai` WRITE;
INSERT INTO `yuli`.`pemakai` VALUES  (79,'yuli','yuli','Yuli','  programmer','Administrator'),
 (80,'made','made','Made','misua','Operator');
UNLOCK TABLES;
/*!40000 ALTER TABLE `pemakai` ENABLE KEYS */;


--
-- Definition of table `yuli`.`penyakit`
--

DROP TABLE IF EXISTS `yuli`.`penyakit`;
CREATE TABLE  `yuli`.`penyakit` (
  `idpenyakit` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nama_penyakit` varchar(50) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `deskripsi` text CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`idpenyakit`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`penyakit`
--

/*!40000 ALTER TABLE `penyakit` DISABLE KEYS */;
LOCK TABLES `penyakit` WRITE;
INSERT INTO `yuli`.`penyakit` VALUES  (1,'cacar air','ga cakep lho'),
 (2,'aids','please...');
UNLOCK TABLES;
/*!40000 ALTER TABLE `penyakit` ENABLE KEYS */;


--
-- Definition of table `yuli`.`rekam_medis`
--

DROP TABLE IF EXISTS `yuli`.`rekam_medis`;
CREATE TABLE  `yuli`.`rekam_medis` (
  `idrekam_medis` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idpasien` int(10) unsigned NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(50) CHARACTER SET latin1 NOT NULL,
  `idpenyakit` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idrekam_medis`),
  KEY `idpasien` (`idpasien`),
  KEY `idpenyakit` (`idpenyakit`),
  CONSTRAINT `rekam_medis_ibfk_1` FOREIGN KEY (`idpasien`) REFERENCES `pasien` (`idpasien`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rekam_medis_ibfk_2` FOREIGN KEY (`idpenyakit`) REFERENCES `penyakit` (`idpenyakit`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`rekam_medis`
--

/*!40000 ALTER TABLE `rekam_medis` DISABLE KEYS */;
LOCK TABLES `rekam_medis` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `rekam_medis` ENABLE KEYS */;


--
-- Definition of table `yuli`.`rekam_medis_gejala`
--

DROP TABLE IF EXISTS `yuli`.`rekam_medis_gejala`;
CREATE TABLE  `yuli`.`rekam_medis_gejala` (
  `idrekam_medis_gejala` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idrekam_medis` int(11) unsigned NOT NULL,
  `idgejala` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idrekam_medis_gejala`),
  KEY `idrekam_medis` (`idrekam_medis`),
  KEY `idgejala` (`idgejala`),
  CONSTRAINT `rekam_medis_gejala_ibfk_1` FOREIGN KEY (`idrekam_medis`) REFERENCES `rekam_medis` (`idrekam_medis`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rekam_medis_gejala_ibfk_2` FOREIGN KEY (`idgejala`) REFERENCES `gejala` (`idgejala`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `yuli`.`rekam_medis_gejala`
--

/*!40000 ALTER TABLE `rekam_medis_gejala` DISABLE KEYS */;
LOCK TABLES `rekam_medis_gejala` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `rekam_medis_gejala` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
