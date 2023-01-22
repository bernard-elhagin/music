package pl.atena.aj.be.music.domain;

public class TrackDTO {

    /* ID utworu w bazie */
    private int trackId;

    /* Tytuł utworu */
    private String title;

    /* ID albumu, na którym znajduje się utwór */
    private int albumId;

    /* Długość utworu w sekundach */
    private int length;

    /* Kolejny numer utworu na albumie */
    private int trackNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
