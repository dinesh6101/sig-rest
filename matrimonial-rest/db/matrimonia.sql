/*
SQLyog Community v12.18 (64 bit)
MySQL - 5.5.24 : Database - matrimonial
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`matrimonial` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `matrimonial`;

/*Table structure for table `bloodgroup` */

DROP TABLE IF EXISTS `bloodgroup`;

CREATE TABLE `bloodgroup` (
  `bGroupName` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bloodgroup` */

insert  into `bloodgroup`(`bGroupName`) values 
('A-'),
('A+'),
('B-'),
('B+'),
('o-'),
('o+'),
('AB-'),
('AB+');

/*Table structure for table `caste` */

DROP TABLE IF EXISTS `caste`;

CREATE TABLE `caste` (
  `casteId` int(2) NOT NULL AUTO_INCREMENT,
  `casteName` char(8) DEFAULT NULL,
  `subcaste1` char(8) DEFAULT NULL,
  `subcaste2` char(8) DEFAULT NULL,
  PRIMARY KEY (`casteId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `caste` */

insert  into `caste`(`casteId`,`casteName`,`subcaste1`,`subcaste2`) values 
(1,'OPEN',NULL,NULL),
(2,'SC',NULL,NULL),
(3,'ST',NULL,NULL),
(4,'OBC',NULL,NULL),
(5,'NT',NULL,NULL);

/*Table structure for table `chat_box` */

DROP TABLE IF EXISTS `chat_box`;

CREATE TABLE `chat_box` (
  `to_uid` int(2) DEFAULT NULL,
  `from_uid` int(2) DEFAULT NULL,
  `message` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `chat_box` */

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cityId` int(2) NOT NULL,
  `cityName` char(8) DEFAULT NULL,
  `stateId` int(2) DEFAULT NULL,
  PRIMARY KEY (`cityId`),
  KEY `FK_CITY_STATE_MAP` (`stateId`),
  CONSTRAINT `FK_CITY_STATE_MAP` FOREIGN KEY (`stateId`) REFERENCES `state` (`stateId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`cityId`,`cityName`,`stateId`) values 
(1,'Mumbai',2),
(2,'Pune',2),
(3,'Toyota',NULL),
(4,'Shanghai',NULL);

/*Table structure for table `contactus` */

DROP TABLE IF EXISTS `contactus`;

CREATE TABLE `contactus` (
  `ct_id` int(2) DEFAULT NULL,
  `name` char(8) DEFAULT NULL,
  `mob_no` int(12) DEFAULT NULL,
  `email_id` varchar(15) DEFAULT NULL,
  `details` varchar(20) DEFAULT NULL,
  `ct_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contactus` */

/*Table structure for table `country` */

DROP TABLE IF EXISTS `country`;

CREATE TABLE `country` (
  `countryId` int(2) NOT NULL AUTO_INCREMENT,
  `countryName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`countryId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `country` */

insert  into `country`(`countryId`,`countryName`) values 
(1,'India'),
(2,'China'),
(3,'Japan');

/*Table structure for table `eduspecification` */

DROP TABLE IF EXISTS `eduspecification`;

CREATE TABLE `eduspecification` (
  `eduSpecId` int(2) DEFAULT NULL,
  `specification` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `eduspecification` */

/*Table structure for table `edutype` */

DROP TABLE IF EXISTS `edutype`;

CREATE TABLE `edutype` (
  `eduTypeId` int(2) DEFAULT NULL,
  `eduType` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `edutype` */

/*Table structure for table `expressinterest` */

DROP TABLE IF EXISTS `expressinterest`;

CREATE TABLE `expressinterest` (
  `to_uid` int(2) DEFAULT NULL,
  `from_uid` int(2) DEFAULT NULL,
  `message` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `expressinterest` */

/*Table structure for table `feedback` */

DROP TABLE IF EXISTS `feedback`;

CREATE TABLE `feedback` (
  `fd_id` int(2) DEFAULT NULL,
  `name` char(8) DEFAULT NULL,
  `comment` varchar(20) DEFAULT NULL,
  `feed_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `feedback` */

/*Table structure for table `gallary` */

DROP TABLE IF EXISTS `gallary`;

CREATE TABLE `gallary` (
  `img_id` int(2) NOT NULL AUTO_INCREMENT,
  `images` tinyblob,
  `prof_id` int(2) DEFAULT NULL,
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `gallary` */

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `L_id` int(2) NOT NULL,
  `uName` varchar(20) DEFAULT NULL,
  `pwd` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`L_id`,`uName`,`pwd`) values 
(1,'ShrikantBaste','abc@123'),
(1,'SachinWagh','pqr@123'),
(1,'DineshBhavsar','xyz@123');

/*Table structure for table `mothertoung` */

DROP TABLE IF EXISTS `mothertoung`;

CREATE TABLE `mothertoung` (
  `mtoungName` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mothertoung` */

insert  into `mothertoung`(`mtoungName`) values 
('Marathi'),
('Hindi'),
('English'),
('Telgu');

/*Table structure for table `profile` */

DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `prof_id` int(2) NOT NULL AUTO_INCREMENT,
  `profCreator` char(7) DEFAULT NULL,
  `name` varchar(8) DEFAULT NULL,
  `maritalStatus` char(8) DEFAULT NULL,
  `bodyType` varchar(8) DEFAULT NULL,
  `skintone` char(8) DEFAULT NULL,
  `physicalStatus` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`prof_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profile` */

/*Table structure for table `religion` */

DROP TABLE IF EXISTS `religion`;

CREATE TABLE `religion` (
  `regName` char(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `religion` */

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `stateId` int(2) NOT NULL AUTO_INCREMENT,
  `statetName` varchar(13) DEFAULT NULL,
  `countryId` int(2) DEFAULT NULL,
  PRIMARY KEY (`stateId`),
  KEY `FK_STATE_COUNTRY_MAP` (`countryId`),
  CONSTRAINT `FK_STATE_COUNTRY_MAP` FOREIGN KEY (`countryId`) REFERENCES `country` (`countryId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `state` */

insert  into `state`(`stateId`,`statetName`,`countryId`) values 
(1,'Gujrath',NULL),
(2,'Maharashtra',NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(2) NOT NULL,
  `firstName` char(10) DEFAULT NULL,
  `lastName` char(10) DEFAULT NULL,
  `gender` char(5) DEFAULT NULL,
  `emailId` varchar(10) DEFAULT NULL,
  `contactId` int(12) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `addressId` int(2) DEFAULT NULL,
  `cityId` int(2) DEFAULT NULL,
  `stateId` int(2) DEFAULT NULL,
  `countryId` char(10) DEFAULT NULL,
  `bloodGroup` varchar(3) DEFAULT NULL,
  `educationId` int(2) DEFAULT NULL,
  `occupation` char(8) DEFAULT NULL,
  `religion` char(7) DEFAULT NULL,
  `caste` char(7) DEFAULT NULL,
  `motherToung` char(1) DEFAULT NULL,
  `height` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `drinkHbt` char(1) DEFAULT NULL,
  `smokeHbt` char(1) DEFAULT NULL,
  `diet` char(6) DEFAULT NULL,
  `maritalStatus` char(7) DEFAULT NULL,
  `images` blob,
  `salary` varchar(7) DEFAULT NULL,
  `star` char(7) DEFAULT NULL,
  `zodiac` char(7) DEFAULT NULL,
  `gothram` char(7) DEFAULT NULL,
  `loginStatus` char(5) DEFAULT NULL,
  `income` int(6) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

/*Table structure for table `user_address` */

DROP TABLE IF EXISTS `user_address`;

CREATE TABLE `user_address` (
  `addressId` int(2) NOT NULL AUTO_INCREMENT,
  `address1` varchar(20) DEFAULT NULL,
  `address2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_address` */

/*Table structure for table `user_contact` */

DROP TABLE IF EXISTS `user_contact`;

CREATE TABLE `user_contact` (
  `contactId` int(10) NOT NULL AUTO_INCREMENT,
  `contact1` int(12) DEFAULT NULL,
  `contact2` int(12) DEFAULT NULL,
  PRIMARY KEY (`contactId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_contact` */

/*Table structure for table `user_education` */

DROP TABLE IF EXISTS `user_education`;

CREATE TABLE `user_education` (
  `educationId` int(2) NOT NULL AUTO_INCREMENT,
  `eduTypeId` int(2) NOT NULL,
  `eduSpecId` int(2) NOT NULL,
  PRIMARY KEY (`educationId`),
  KEY `FK_EDUCATION_TYPE_MAP` (`eduTypeId`),
  KEY `FK_EDUCATION_SPEC_MAP` (`eduSpecId`),
  CONSTRAINT `FK_EDUCATION_SPEC_MAP` FOREIGN KEY (`eduSpecId`) REFERENCES `user` (`userId`),
  CONSTRAINT `FK_EDUCATION_TYPE_MAP` FOREIGN KEY (`eduTypeId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_education` */

/*Table structure for table `user_profession` */

DROP TABLE IF EXISTS `user_profession`;

CREATE TABLE `user_profession` (
  `userId` int(2) DEFAULT NULL,
  `profName` char(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_profession` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
