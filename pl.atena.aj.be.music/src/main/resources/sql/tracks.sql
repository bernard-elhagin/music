CREATE TABLE `tracks` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID utworu',
  `title`               varchar(256)    DEFAULT NULL                COMMENT 'Tytuł utworu',
  `length`    int(10)   unsigned        DEFAULT NULL                COMMENT 'Długość utworu w sekundach',
  `track_no`  int(10)   unsigned        DEFAULT NULL                COMMENT 'Numer utworu na albumie',
  `album_id`  int(10)   unsigned        NOT     NULL                COMMENT 'ID albumu, na którym znajduje się utwór',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;