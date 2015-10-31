CREATE TABLE `album_tracks` (
  `album_id`  int(10)   NOT NULL COMMENT 'ID albumu',
  `track_id`  int(10)   NOT NULL COMMENT 'ID utworu',
  PRIMARY KEY (`album_id`, `track_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;