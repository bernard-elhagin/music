#/usr/bin/perl
use strict;
use warnings;

# Skrypt generujący inserty na podstawie filesystemu

use File::Find;

open (my $OUT, '>', 'fillDB.sql') or die $!;

my %_seen;

find(\&dir_names, 'M:/Uberized Rips/');

sub process_dir {
    my $dir = shift;

    my $sql;

    my ($artist, $year, $title) = split / - /, $dir;

    return if $artist =~ m/'/;
    return if $title =~ m/'/;

    $artist =~ s/&/and/g;
    $title =~ s/&/and/g;

    my $genre_id = random_genre();

    my $artist_id = "SELECT id FROM music.artists WHERE name='$artist'";

    $sql = <<SQL;
INSERT INTO music.artists (name) VALUES ("$artist");
INSERT INTO music.albums (title, artist_id, genre_id, year) VALUES ("$title", ($artist_id), $genre_id, $year);

SQL

    print $OUT $sql;
}

sub random_genre {
    my $minimum = 0;
    my $maximum = 126;

    return $minimum + int(rand($maximum - $minimum));
}

sub dir_names {

    my $dir = $File::Find::dir;

    if (not $_seen{$dir}++) {
        $dir =~ s/^.*\/(.*)$/$1/;

        if($dir =~ m/^.+ - \d{4} - .+$/) {
            process_dir($dir);
        }
    }
}
