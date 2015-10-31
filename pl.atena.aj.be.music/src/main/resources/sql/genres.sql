CREATE TABLE `genres` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID gatunku',
  `name`                varchar(256)    DEFAULT NULL                COMMENT 'Nazwa gatunku',
  `description`         varchar(512)    DEFAULT NULL                COMMENT 'Opis gatunku',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;