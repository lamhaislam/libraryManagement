-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema library
--

CREATE DATABASE IF NOT EXISTS library;
USE library;

--
-- Definition of table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
CREATE TABLE `adminlogin` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` (`id`,`name`,`password`) VALUES 
 (1,'Sifat','1234');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;


--
-- Definition of table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `bookno` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `date` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` (`id`,`bookno`,`name`,`author`,`publisher`,`quantity`,`date`) VALUES 
 (1,'101','Database Knowledge','asd','cvcfgb ',9,'2019-02-15'),
 (2,'102','Management thought','dsfdgdhf','scdfxzscf',11,'2019-02-15'),
 (3,'103','Business Resurch','dscf fvb ','bvgfcdfc b',10,'2019-02-15');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;


--
-- Definition of table `issuebooks`
--

DROP TABLE IF EXISTS `issuebooks`;
CREATE TABLE `issuebooks` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `bookno` varchar(45) NOT NULL,
  `studentid` varchar(45) NOT NULL,
  `studentname` varchar(45) NOT NULL,
  `studentcontact` varchar(45) NOT NULL,
  `issuedate` varchar(45) NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `bookname` varchar(45) NOT NULL,
  `returndate` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issuebooks`
--

/*!40000 ALTER TABLE `issuebooks` DISABLE KEYS */;
INSERT INTO `issuebooks` (`id`,`bookno`,`studentid`,`studentname`,`studentcontact`,`issuedate`,`quantity`,`bookname`,`returndate`) VALUES 
 (3,'103','2','Sanjana','03925622351','2019-02-15',1,'Business Resurch','2019-02-18');
/*!40000 ALTER TABLE `issuebooks` ENABLE KEYS */;


--
-- Definition of table `librarianlogin`
--

DROP TABLE IF EXISTS `librarianlogin`;
CREATE TABLE `librarianlogin` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `librarianlogin`
--

/*!40000 ALTER TABLE `librarianlogin` DISABLE KEYS */;
INSERT INTO `librarianlogin` (`id`,`name`,`address`,`email`,`password`,`contact`,`date`) VALUES 
 (2,'Murad','Mohakhali','maruf@gmail.com','[C@157e3979','01236652536','2019-02-15'),
 (3,'Mimi','Jatrabari','mimi@gmail.com','135','01113326542','2019-02-15'),
 (4,'Muhurto','Donia','Muhurto@gmail.com','12345','01362564525','2019-02-15'),
 (5,'Oni','Banani','oni@gmail.com','[C@5f4a03be','01362596335','');
/*!40000 ALTER TABLE `librarianlogin` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`name`,`contact`) VALUES 
 (1,'Tomal','01122553211'),
 (2,'Sanjana','03925622351');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
