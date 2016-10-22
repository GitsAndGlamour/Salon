CREATE TABLE IF NOT EXISTS `shift` (
  `shift_id` varchar(255) NOT NULL,
  `start_ts` datetime DEFAULT NULL,
  `end_ts` datetime DEFAULT NULL,
  `staff_id` varchar(255) DEFAULT NULL,
  `create_admin` varchar(255) NOT NULL DEFAULT '0',
  `update_admin` varchar(255) DEFAULT NULL,
  `create_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_ts` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`shift_id`)
);
