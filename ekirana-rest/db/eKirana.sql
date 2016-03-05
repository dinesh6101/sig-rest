/*
SQLyog Community Edition- MySQL GUI v6.15
MySQL - 5.5.37 : Database - ekirana
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `ekirana`;

USE `ekirana`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `access_role_tokens` */

DROP TABLE IF EXISTS `access_role_tokens`;

CREATE TABLE `access_role_tokens` (
  `Role_Token_Id` int(11) NOT NULL AUTO_INCREMENT,
  `RoleId` int(11) NOT NULL DEFAULT '0',
  `TokenId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Role_Token_Id`),
  KEY `RoleId` (`RoleId`),
  KEY `TokenId` (`TokenId`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `access_role_tokens` */

insert  into `access_role_tokens`(`Role_Token_Id`,`RoleId`,`TokenId`) values (1,3,1),(2,3,2);

/*Table structure for table `access_roles` */

DROP TABLE IF EXISTS `access_roles`;

CREATE TABLE `access_roles` (
  `RoleId` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(100) NOT NULL DEFAULT '',
  `Description` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`RoleId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `access_roles` */

insert  into `access_roles`(`RoleId`,`RoleName`,`Description`) values (2,'Staff','Customer role for read-only access (single db)'),(3,'Super_User','Have all read/write access, can create new users'),(4,'Employee','Read only access (all db)'),(5,'Enterprise','Have all read access plus can write schedules, overrides, strategies.'),(6,'Contractor','Specific functions as needed'),(9,'Admin ss','Have all read/write access (all db) ss');

/*Table structure for table `access_tokens` */

DROP TABLE IF EXISTS `access_tokens`;

CREATE TABLE `access_tokens` (
  `TokenId` int(11) NOT NULL AUTO_INCREMENT,
  `TokenName` varchar(100) NOT NULL DEFAULT '',
  `Description` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`TokenId`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `access_tokens` */

insert  into `access_tokens`(`TokenId`,`TokenName`,`Description`) values (1,'VIEW_INFO','View information'),(2,'EDIT_INFO','Edit information');

/*Table structure for table `access_user` */

DROP TABLE IF EXISTS `access_user`;

CREATE TABLE `access_user` (
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `access_user` */

insert  into `access_user`(`UserId`,`RoleId`,`PartnerId`,`FullName`,`UserName`,`Password`,`ValidAfter`,`ValidBefore`,`Failed_Logins_Count`,`AccessKey`,`AgreementId`) values (1,3,0,'Test User1','test.user1@sig.com','8562ca1bd08822f57c1fd3a4bc32cdea2f00895f','2013-08-01',NULL,0,NULL,1),(2,3,0,'Test Admin User','test.admin@sig.com','d9f0fc8309fe4293a3e1953756f91b435ee639d5','2013-07-22',NULL,0,NULL,1),(3,3,0,'Test User2','test.user2@sig.com','c5cd1b8553fe5f8790dc3d7a05da035aedab1012','2013-08-01',NULL,0,NULL,1),(4,3,0,'Test User3','test.user3@sig.com','1d2aaa4200d6c6669a8d93435f4609b643fe3972','2013-08-01',NULL,0,NULL,1),(5,3,0,'Dinesh Bhavsar','dinesh@sig.com','d02f9eeeab3c10406e510f722877f8c6233e53cf','2013-09-12',NULL,0,NULL,1);

/*Table structure for table `brand` */

DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `brandId` int(11) NOT NULL AUTO_INCREMENT,
  `brandName` varchar(255) NOT NULL,
  `description` varchar(999) DEFAULT NULL,
  `modeInfo` varchar(999) DEFAULT NULL,
  `url` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`brandId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `brand` */

insert  into `brand`(`brandId`,`brandName`,`description`,`modeInfo`,`url`,`createdOn`,`createdBy`,`updatedOn`,`updatedBy`) values (1,'Fresho',NULL,NULL,NULL,NULL,NULL,'2015-10-17 18:04:48',NULL);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `customerName` varchar(25) NOT NULL,
  `customerAddress` varchar(255) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

/*Table structure for table `customer_list` */

DROP TABLE IF EXISTS `customer_list`;

CREATE TABLE `customer_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(999) DEFAULT NULL,
  `customerId` int(11) DEFAULT NULL,
  `isPublic` varchar(3) DEFAULT 'NO',
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_customer_list_customer` FOREIGN KEY (`id`) REFERENCES `customer` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_list` */

/*Table structure for table `customer_order` */

DROP TABLE IF EXISTS `customer_order`;

CREATE TABLE `customer_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) DEFAULT NULL,
  `itemId` int(11) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `orderTrackId` int(11) DEFAULT NULL,
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_customer_order_customer` FOREIGN KEY (`id`) REFERENCES `customer` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_order` */

/*Table structure for table `grocery_category` */

DROP TABLE IF EXISTS `grocery_category`;

CREATE TABLE `grocery_category` (
  `grocerycategoryid` int(11) NOT NULL AUTO_INCREMENT,
  `groceryCategoryName` varchar(50) NOT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`grocerycategoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `grocery_category` */

insert  into `grocery_category`(`grocerycategoryid`,`groceryCategoryName`,`createdOn`,`createdBy`,`updatedOn`,`updatedBy`) values (1,'Fruits & Vegetables','2015-01-01 00:00:00',NULL,'2015-01-01 00:00:00',NULL);

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(999) DEFAULT NULL,
  `path` varchar(999) DEFAULT NULL,
  `imageData` longblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image` */

/*Table structure for table `item_brand` */

DROP TABLE IF EXISTS `item_brand`;

CREATE TABLE `item_brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemId` int(11) DEFAULT NULL,
  `brandId` int(11) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `item_brand` */

insert  into `item_brand`(`id`,`itemId`,`brandId`,`createdOn`,`createdBy`,`updatedOn`,`updatedBy`) values (1,1,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:16:49',NULL),(2,2,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:17:01',NULL),(3,3,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:17:02',NULL),(4,4,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:17:05',NULL),(5,5,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:17:11',NULL),(6,6,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:20:19',NULL),(7,7,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:20:21',NULL),(8,8,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:20:28',NULL),(9,9,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:28:50',NULL),(10,10,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:28:53',NULL),(11,11,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:28:55',NULL),(12,12,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:28:57',NULL),(13,13,1,'0000-00-00 00:00:00',NULL,'2015-10-18 16:29:01',NULL);

/*Table structure for table `item_category` */

DROP TABLE IF EXISTS `item_category`;

CREATE TABLE `item_category` (
  `itemCategoryId` int(11) NOT NULL AUTO_INCREMENT,
  `groceryCategoryId` int(11) NOT NULL,
  `itemCategoryName` varchar(255) NOT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`itemCategoryId`),
  KEY `FK_item_category` (`groceryCategoryId`),
  CONSTRAINT `FK_item_category` FOREIGN KEY (`groceryCategoryId`) REFERENCES `grocery_category` (`grocerycategoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `item_category` */

insert  into `item_category`(`itemCategoryId`,`groceryCategoryId`,`itemCategoryName`,`createdOn`,`createdBy`,`updatedOn`,`updatedBy`) values (1,1,'Cut Fruits & Vegetables','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:32',NULL),(2,1,'Flowers','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:38',NULL),(3,1,'Fresho Ayurveda ','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:42',NULL),(4,1,'Fruits','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:49',NULL),(5,1,'Organic F&V','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:53',NULL),(6,1,'Vegetables','0000-00-00 00:00:00',NULL,'2015-10-18 16:05:56',NULL);

/*Table structure for table `item_offers` */

DROP TABLE IF EXISTS `item_offers`;

CREATE TABLE `item_offers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemId` int(11) DEFAULT NULL,
  `discountInPerentage` float DEFAULT NULL,
  `createOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_item_offers_items` (`itemId`),
  CONSTRAINT `FK_item_offers_items` FOREIGN KEY (`itemId`) REFERENCES `items` (`itemId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item_offers` */

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `itemId` int(11) NOT NULL AUTO_INCREMENT,
  `groceryCategoryId` int(11) DEFAULT NULL,
  `itemCategoryId` int(11) NOT NULL,
  `itemName` varchar(255) NOT NULL,
  `itemSubName` varchar(999) DEFAULT NULL,
  `unit` varchar(999) NOT NULL,
  `cost` float DEFAULT NULL,
  `imageId` int(11) DEFAULT NULL,
  `itemDescription` varchar(255) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `message` varchar(999) DEFAULT NULL,
  `createOn` timestamp NULL DEFAULT NULL,
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updateBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`itemId`),
  KEY `FK_items` (`itemCategoryId`),
  KEY `FK_items_items` (`imageId`),
  KEY `FK_items_grocery_category` (`groceryCategoryId`),
  CONSTRAINT `FK_items_grocery_category` FOREIGN KEY (`groceryCategoryId`) REFERENCES `grocery_category` (`grocerycategoryid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_items` FOREIGN KEY (`itemCategoryId`) REFERENCES `item_category` (`itemCategoryId`),
  CONSTRAINT `FK_items_items` FOREIGN KEY (`imageId`) REFERENCES `image` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `items` */

insert  into `items`(`itemId`,`groceryCategoryId`,`itemCategoryId`,`itemName`,`itemSubName`,`unit`,`cost`,`imageId`,`itemDescription`,`rating`,`message`,`createOn`,`createdBy`,`updatedOn`,`updateBy`) values (1,1,1,'Garlic',NULL,'100 gm',20,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:10:29',NULL),(2,1,1,'Diced',NULL,'100 gm',15,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:11:51',NULL),(3,1,2,'Marigold - Orange',NULL,'250 gm',21,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:14:37',NULL),(4,1,2,'Marigold - Yellow ',NULL,'250 gm',21,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:14:43',NULL),(5,1,2,'Chrysanthemum',NULL,'100 gm',50,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:15:27',NULL),(6,1,3,'Aloe Vera - Organically grown',NULL,'1 nos',35,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:19:30',NULL),(7,1,3,'Neem Giloy (Amruta balli) - Organically Grown',NULL,'100 gm',10,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:19:32',NULL),(8,1,3,'Turmeric ',NULL,'250 gm',15,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:19:58',NULL),(9,1,4,'Apple','Washington','3 pcs',129,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:22:28',NULL),(10,1,4,'Apple ','Kinnaur ','6 pcs',129,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:23:44',NULL),(11,1,4,'Apple','Royal Gala','6 pcs',129,NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 16:24:15',NULL),(12,1,4,'Banana','Yelakki ','500 gm',37,NULL,NULL,NULL,'approx. 8 to 9 nos',NULL,NULL,'2015-10-18 16:28:02',NULL),(13,1,4,'Banana','Robusta ','500 gm',16,NULL,NULL,NULL,'approx. 3 to 4 nos',NULL,NULL,'2015-10-18 16:28:07',NULL);

/*Table structure for table `kart_details` */

DROP TABLE IF EXISTS `kart_details`;

CREATE TABLE `kart_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) NOT NULL,
  `itemId` int(11) NOT NULL,
  `quantity` float DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT NULL,
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_kart_details` (`customerId`),
  KEY `FK_kart_item_details` (`itemId`),
  CONSTRAINT `FK_kart_details` FOREIGN KEY (`customerId`) REFERENCES `customer` (`customerId`),
  CONSTRAINT `FK_kart_item_details` FOREIGN KEY (`itemId`) REFERENCES `items` (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `kart_details` */

/*Table structure for table `list` */

DROP TABLE IF EXISTS `list`;

CREATE TABLE `list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemId` int(11) DEFAULT NULL,
  `itemName` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `list` */

/*Table structure for table `order_notifications` */

DROP TABLE IF EXISTS `order_notifications`;

CREATE TABLE `order_notifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL,
  `sms` varchar(999) DEFAULT NULL,
  `email` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_notifications` */

/*Table structure for table `order_payment` */

DROP TABLE IF EXISTS `order_payment`;

CREATE TABLE `order_payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL,
  `totalPaymentMade` float DEFAULT NULL,
  `paymentMode` int(11) DEFAULT NULL,
  `paymentStatus` int(11) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_order_payment_mode` (`paymentMode`),
  KEY `FK_order_payment_status` (`paymentStatus`),
  CONSTRAINT `FK_order_payment_status` FOREIGN KEY (`paymentStatus`) REFERENCES `payment_status` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `FK_order_payment_mode` FOREIGN KEY (`paymentMode`) REFERENCES `payment_mode` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `order_payment` */

/*Table structure for table `order_status` */

DROP TABLE IF EXISTS `order_status`;

CREATE TABLE `order_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(999) DEFAULT NULL,
  `smsTemplate` varchar(999) DEFAULT NULL,
  `emailTemplate` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_status` */

/*Table structure for table `order_track` */

DROP TABLE IF EXISTS `order_track`;

CREATE TABLE `order_track` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL,
  `statusId` int(11) DEFAULT NULL,
  `createdOn` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_track` */

/*Table structure for table `payment_mode` */

DROP TABLE IF EXISTS `payment_mode`;

CREATE TABLE `payment_mode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mode` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payment_mode` */

/*Table structure for table `payment_status` */

DROP TABLE IF EXISTS `payment_status`;

CREATE TABLE `payment_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staus` varchar(999) DEFAULT NULL,
  `createdOn` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `createdBy` varchar(9999) DEFAULT NULL,
  `updatedOn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedBy` varchar(9999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payment_status` */

/*Table structure for table `sign_up` */

DROP TABLE IF EXISTS `sign_up`;

CREATE TABLE `sign_up` (
   `signUpId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(100) NOT NULL DEFAULT '',
  `lastName` varchar(100) NOT NULL DEFAULT '',
  `emailId` varchar(100) NOT NULL DEFAULT '',
  `mobileNo` int(11),
  `pinCode` int(11),
  `area` varchar(100),
  `houseNo` varchar(100),
  `streetDetails` varchar(100),
  `landMarks` varchar(100),
  `city` varchar(100),
  PRIMARY KEY (`signUpId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `sign_up` */

insert  into `sign_up`(`signUpId`,`firstName`,`lastName`,`emailId`) values (4,'Dinesh','Bhavsar','dinesh94@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
