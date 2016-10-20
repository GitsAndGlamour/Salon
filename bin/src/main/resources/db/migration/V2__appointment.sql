CREATE TABLE `appointment` (
  `appointment_id` int(8) NOT NULL,
  `service_id` varchar(255) DEFAULT NULL,
  `customer_id` varchar(255) NOT NULL,
  `promotion_id` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `is_repeated` tinyint(1) DEFAULT NULL,
  `staff_id` varchar(255) DEFAULT NULL,
  `resources` varchar(255) DEFAULT NULL,
  `status_code` varchar(255) DEFAULT NULL,
  `check_in` datetime DEFAULT NULL,
  `scheduled_at` datetime DEFAULT NULL,
  `create_admin` varchar(255) NOT NULL DEFAULT '0',
  `update_admin` varchar(255) DEFAULT NULL,
  `create_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_ts` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`appointment_id`)
);
