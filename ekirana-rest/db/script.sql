-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.37 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for eKirana
CREATE DATABASE IF NOT EXISTS `eKirana` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `eKirana`;


-- Dumping structure for table eKirana.access_roles
CREATE TABLE IF NOT EXISTS `access_roles` (
  `RoleId` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(100) NOT NULL DEFAULT '',
  `Description` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`RoleId`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table eKirana.access_roles: 6 rows
/*!40000 ALTER TABLE `access_roles` DISABLE KEYS */;
INSERT INTO `access_roles` (`RoleId`, `RoleName`, `Description`) VALUES
	(1, 'Admin', 'Have all read/write access (all db)'),
	(2, 'Staff', 'Customer role for read-only access (single db)'),
	(3, 'Super_User', 'Have all read/write access, can create new users'),
	(4, 'Employee', 'Read only access (all db)'),
	(5, 'Enterprise', 'Have all read access plus can write schedules, overrides, strategies.'),
	(6, 'Contractor', 'Specific functions as needed');
/*!40000 ALTER TABLE `access_roles` ENABLE KEYS */;


-- Dumping structure for table eKirana.access_role_tokens
CREATE TABLE IF NOT EXISTS `access_role_tokens` (
  `Role_Token_Id` int(11) NOT NULL AUTO_INCREMENT,
  `RoleId` int(11) NOT NULL DEFAULT '0',
  `TokenId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Role_Token_Id`),
  KEY `RoleId` (`RoleId`),
  KEY `TokenId` (`TokenId`)
) ENGINE=MyISAM AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

-- Dumping data for table eKirana.access_role_tokens: 1 rows
/*!40000 ALTER TABLE `access_role_tokens` DISABLE KEYS */;
INSERT INTO `access_role_tokens` (`Role_Token_Id`, `RoleId`, `TokenId`) VALUES
	(1, 3, 1), (2, 3, 2);
/*!40000 ALTER TABLE `access_role_tokens` ENABLE KEYS */;


-- Dumping structure for table eKirana.access_tokens
CREATE TABLE IF NOT EXISTS `access_tokens` (
  `TokenId` int(11) NOT NULL AUTO_INCREMENT,
  `TokenName` varchar(100) NOT NULL DEFAULT '',
  `Description` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`TokenId`)
) ENGINE=MyISAM AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;

-- Dumping data for table eKirana.access_tokens: 2 rows
/*!40000 ALTER TABLE `access_tokens` DISABLE KEYS */;
INSERT INTO `access_tokens` (`TokenId`, `TokenName`, `Description`) VALUES
	(1, 'VIEW_INFO', 'View information'),
	(2, 'EDIT_INFO', 'Edit information');
/*!40000 ALTER TABLE `access_tokens` ENABLE KEYS */;


-- Dumping structure for table eKirana.access_user
CREATE TABLE IF NOT EXISTS `access_user` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `RoleId` int(11) NOT NULL DEFAULT '0',
  `PartnerId` int(11) NOT NULL DEFAULT '0',
  `FullName` varchar(100) NOT NULL DEFAULT '',
  `UserName` varchar(100) NOT NULL DEFAULT '',
  `Password` varchar(255) DEFAULT NULL,
  `ValidAfter` date DEFAULT '0000-00-00',
  `ValidBefore` date DEFAULT '0000-00-00',
  `Failed_Logins_Count` int(11) NOT NULL DEFAULT '0',
  `AccessKey` varchar(100) DEFAULT NULL,
  `AgreementId` int(11) DEFAULT NULL,
  PRIMARY KEY (`UserId`),
  KEY `RoleId` (`RoleId`),
  KEY `PartnerId` (`PartnerId`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- Dumping data for table eKirana.access_user: 11 rows
/*!40000 ALTER TABLE `access_user` DISABLE KEYS */;
INSERT INTO `access_user` (`UserId`, `RoleId`, `PartnerId`, `FullName`, `UserName`, `Password`, `ValidAfter`, `ValidBefore`, `Failed_Logins_Count`, `AccessKey`, `AgreementId`) VALUES
	(1, 3, 0, 'Test User1', 'test.user1@sig.com', '8562ca1bd08822f57c1fd3a4bc32cdea2f00895f', '2013-08-01', NULL, 0, NULL, 1),
	(2, 3, 0, 'Test Admin User', 'test.admin@sig.com', 'd9f0fc8309fe4293a3e1953756f91b435ee639d5', '2013-07-22', NULL, 0, NULL, 1),
	(3, 3, 0, 'Test User2', 'test.user2@sig.com', 'c5cd1b8553fe5f8790dc3d7a05da035aedab1012', '2013-08-01', NULL, 0, NULL, 1),
	(4, 3, 0, 'Test User3', 'test.user3@sig.com', '1d2aaa4200d6c6669a8d93435f4609b643fe3972', '2013-08-01', NULL, 0, NULL, 1),
	(5, 3, 0, 'Dinesh Bhavsar', 'dinesh@sig.com', 'd02f9eeeab3c10406e510f722877f8c6233e53cf', '2013-09-12', NULL, 0, NULL, 1);
/*!40000 ALTER TABLE `access_user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
