CREATE TABLE `tracks` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID utworu',
  `title`               varchar(256)    DEFAULT NULL                COMMENT 'Tytu� utworu',
  `length`    int(10)   unsigned        DEFAULT NULL                COMMENT 'D�ugo�� utworu w sekundach',
  `track_no`  int(10)   unsigned        DEFAULT NULL                COMMENT 'Numer utworu na albumie',
  `album_id`  int(10)   unsigned        NOT     NULL                COMMENT 'ID albumu, na kt�rym znajduje si� utw�r',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;