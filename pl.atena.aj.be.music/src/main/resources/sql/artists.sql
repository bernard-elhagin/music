CREATE TABLE `artists` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID wykonawcy',
  `name`                varchar(256)    DEFAULT NULL                COMMENT 'Nazwa wykonawcy',
  `description`         varchar(512)    DEFAULT NULL                COMMENT 'Opis wykonawcy',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;