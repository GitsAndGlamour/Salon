CREATE TABLE IF NOT EXISTS `promotion` (
  `promotion_id` varchar(255) NOT NULL,
  `name` varchar(35) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `discount_type` varchar(255) DEFAULT NULL,
  `is_available` tinyint(1) DEFAULT NULL,
  `limit` varchar(255) DEFAULT NULL,
  `requires_code` tinyint(1) DEFAULT NULL,
  `valid_codes` varchar(255) DEFAULT NULL,
  `valid_services` varchar(255) DEFAULT NULL,
  `create_admin` varchar(255) NOT NULL DEFAULT '0',
  `update_admin` varchar(255) DEFAULT NULL,
  `create_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_ts` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`promotion_id`)
);
