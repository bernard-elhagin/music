CREATE TABLE `auction` (
  `auction_id` int(10)                        NOT NULL COMMENT 'ID aukcji',
  `name`             varchar(256)         DEFAULT NULL COMMENT 'Nazwa aukcji',
  `description`      varchar(512)         DEFAULT NULL COMMENT 'Opis aukcji',
  `end_date`         date                 DEFAULT NULL COMMENT 'Data koñca aukcji',
  `final_price`      double(10,2) unsigned DEFAULT NULL COMMENT 'Cena koñcowa',
  PRIMARY KEY (`auction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;