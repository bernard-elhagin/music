CREATE TABLE `albums` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID albumu',
  `title`               varchar(255)    DEFAULT NULL                COMMENT 'Tytuł albumu',
  `artist_id` int(10)   unsigned        DEFAULT NULL                COMMENT 'ID wykonawcy',
  `genre_id`  int(10)   unsigned        DEFAULT NULL                COMMENT 'ID gatunku',
  `year`      int(4)    unsigned        DEFAULT NULL                COMMENT 'Rok wydania',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;