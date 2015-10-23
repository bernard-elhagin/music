CREATE TABLE `camera` (
  `camera_id` int(10)   unsigned            NOT NULL AUTO_INCREMENT COMMENT 'ID aparatu',
  `camera_make`         varchar(45)         NOT NULL                COMMENT 'Marka aparatu',
  `camera_model`        varchar(45)         NOT NULL                COMMENT 'Model aparatu',
  `final_price`         decimal(10,2)   DEFAULT NULL                COMMENT 'Ostateczna cena aparatu',
  PRIMARY KEY (`camera_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;