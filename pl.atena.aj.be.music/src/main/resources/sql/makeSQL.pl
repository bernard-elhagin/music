#/usr/bin/perl

#
# Skrypt generujący inserty na podstawie danych w seckcji __DATA__
#

use strict;
use warnings;

open (my $OUT, '>', 'musicDB.sql') or die $!;

my $sql;

while (<DATA>) {
    chomp;
    my ($title, $artist, $genre_id, $year) = split /:/;

    my $artist_id = "SELECT id FROM music.artists WHERE name='$artist'";

    $sql = <<SQL;
INSERT INTO music.artists (name) VALUES ("$artist");
INSERT INTO music.albums (title, artist_id, genre_id, year) VALUES ("$title", ($artist_id), $genre_id, $year);

SQL

    print $OUT $sql;
}

__DATA__
In the Court of the Crimson King:King Crimson:87:1969
Kind of Blue:Miles Davis:63:1959
Equinoxe:Jean-Michel Jarre:37:1978
Hand on the Torch:Us3:2:1993
Homework:Daft Punk:57:1997
Animals:Pink Floyd:99:1977
Are You Experienced:The Jimi Hendrix Experience:99:1967
Live at the House of Tribes:Wynton Marsalis:63:2005
1984:Van Halen:99:1984
Under the Pink:Tori Amos:80:1994
Master of Puppets:Metallica:69:1986
Paranoid:Black Sabbath:99:1970
Lizard:King Crimson:87:1970
Like a Virgin:Madonna:80:1984
Thriller:Michael Jackson:80:1982
Songs in the Key of Life:Stevie Wonder:108:1976
