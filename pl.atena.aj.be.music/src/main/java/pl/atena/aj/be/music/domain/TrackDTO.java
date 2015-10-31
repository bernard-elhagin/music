package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class TrackDTO implements Serializable {
	
	private static final long serialVersionUID = 4844364451564598906L;

	/* ID utworu w bazie */
	private int trackId;
	
	/* Tytu³ utworu */
	private String title;

	/* Numer utworu na albumie */
	private int trackNumber;
	
	/* D³ugoœæ trwania utworu w sekundach */
	private int length;

	/* ID albumu, na którym znajduje siê utwór */
	private int albumId;
	
	public TrackDTO() {	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	@Override
	public String toString() {
		return "TrackDTO [trackId=" + trackId + ", title=" + title + ", trackNumber=" + trackNumber + ", length="
				+ length + ", albumId=" + albumId + "]";
	}
}