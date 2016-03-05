SET FOREIGN_KEY_CHECKS=0;

SET FOREIGN_KEY_CHECKS=1;

alter table `ekirana`.`payment_status` 
add column `createdOn` timestamp  NULL default '0000-00-00 00:00:00',
add column `createdBy` varchar (9999)  NULL,
add column `updatedOn` timestamp  default CURRENT_TIMESTAMP,
add column `updatedBy` varchar (9999)  NULL