CREATE SCHEMA `ecodation_2_otomasyon` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

use ecodation_2_otomasyon;


CREATE TABLE `ecodation_2_otomasyon`.`admin` (
  `admin_id` INT NOT NULL AUTO_INCREMENT,
  `admin_name` VARCHAR(450) NULL,
  `admin_surname` VARCHAR(450) NULL,
  `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`admin_id`));
