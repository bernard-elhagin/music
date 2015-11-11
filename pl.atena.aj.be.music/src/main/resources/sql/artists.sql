CREATE TABLE `artists` (
  `id`        int(10)   unsigned        NOT     NULL AUTO_INCREMENT COMMENT 'ID wykonawcy',
  `name`                varchar(255)    DEFAULT NULL                COMMENT 'Nazwa wykonawcy',
  `description`         varchar(512)    DEFAULT NULL                COMMENT 'Opis wykonawcy',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Wymuszenie unikalności wykonawców by można
-- było inserty wykonywać nie martwiąc się o
-- dublowanie.
ALTER TABLE music.artists
  ADD CONSTRAINT uq_name UNIQUE (name);