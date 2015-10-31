CREATE TABLE `albums` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID albumu',
  `title`               varchar(256)    DEFAULT NULL                COMMENT 'Tytu³ albumu',
  `artist_id` int(10)   unsigned        DEFAULT NULL                COMMENT 'ID wykonawcy',
  `genre_id`  int(10)   unsigned        DEFAULT NULL                COMMENT 'ID gatunku',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;