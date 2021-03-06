CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` varchar(255) NOT NULL,
  `first` varchar(35) NOT NULL,
  `last` varchar(35) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(75) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `postal` char(5) DEFAULT NULL,
  `phone` varchar(12) NOT NULL,
  `alt_phone` varchar(12) DEFAULT NULL,
  `role_id` varchar(255) NOT NULL,
  `services` varchar(255) DEFAULT NULL,
  `status_code` varchar(255) DEFAULT NULL,
  `create_admin` varchar(255) NOT NULL DEFAULT '0',
  `update_admin` varchar(255) DEFAULT NULL,
  `create_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_ts` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `PASSWORD` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
);

INSERT INTO `staff` (`staff_id`, `first`, `last`, `email`, `address`, `city`, `state`, `postal`, `phone`, `alt_phone`, `role_id`, `services`, `status_code`, `create_admin`, `update_admin`, `create_ts`, `update_ts`, `is_active`, `PASSWORD`)
VALUES
	(0,'Store','System','system@salon.com',NULL,NULL,NULL,NULL,'678-555-5555',NULL,4000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(1235,'Patrick','Ludtke','patrickl@gillaspie.com','67 Rv Cent','Boise','ID','83709','208-709-1235','208-206-9848',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(1454,'Colleen','Johnson','colleenj@kampa.org','2 Sw Nyberg Rd','Elkhart','IN','46514','574-499-1454','574-330-1884',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(1805,'Rebecca','Reimer','rebeccar@hotmail.com','8284 Hart St','Abilene','KS','67410','785-347-1805','785-253-7049',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(2182,'Janelle','Kreidler','janellek @cox.net','89992 E 15th St','Alliance','NE','69301','308-726-2182','308-250-6987',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(3294,'Jenny','Klug','jennyk@gmail.com','1933 Packer Ave Apt 2','Novato','CA','94945','415-423-3294','415-926-6089',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(3571,'Mel','Moore','melm@ankeny.org','5 Washington St Apt 1','Roseville','CA','95678','916-920-3571','916-459-2433',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(4118,'Lynn','Snyder','lynns@gmail.com','8 S Haven St','Daytona Beach','FL','32114','386-248-4118','386-208-6976',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(4842,'Lee','Stafford','lees@aol.com','63 E Aurora Dr','Orlando','FL','32804','407-413-4842','407-557-8857',2000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(6498,'Chaz','Dean','chazd@yahoo.com','61556 W 20th Ave','Seattle','WA','98104','206-711-6498','206-395-6284',3000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root'),
	(7516,'Kim Marie','Franckowiak','kim_marief @hixenbaugh.org','9 Front St','Washington','DC','20001','202-646-7516','202-276-6826',1000,'',NULL,0,NULL,'2016-09-18 22:36:18','2016-09-18 22:36:18',1,'root');
